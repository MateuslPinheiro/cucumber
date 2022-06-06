import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AprenderCucumberSteps {
    @Dado("^que criei o arquivo corretamente$")
    public void queCrieiOArquivoCorretamente() throws Throwable {

    }

    @Quando("^executá-lo$")
    public void executáLo() throws Throwable {

    }

    @Então("^a especificação deve finalizar com sucesso$")
    public void aEspecificaçãoDeveFinalizarComSucesso() throws Throwable {

    }
    private int contador = 0;
    @Dado("^que o valor do contador é (\\d+)$")
    public void queOValorDoContadorÉ(int arg1) throws Throwable {
        contador = arg1;
    }

    @Quando("^eu incrementar em (\\d+)$")
    public void euIncrementarEm(int arg1) throws Throwable {
        contador = contador + arg1;
    }

    @Então("^o valor do contador será (\\d+)$")
    public void oValorDoContadorSerá(int arg1) throws Throwable {
        Assert.assertEquals(arg1, contador);
    }

    Date entrega = new Date();
    @Dado("^que a entrega é dia (\\d{2})/(\\d{2})/(\\d{4})$")
    public void queAEntregaÉDia(int dia, int mes, int ano) throws Throwable {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, dia);
        cal.set(Calendar.MONTH, mes - 1);
        cal.set(Calendar.YEAR, ano);
        entrega = cal.getTime();

    }

    @Quando("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
    public void aEntregaAtrasarEmDias(int arg1, String tempo) throws Throwable {
        Calendar cal = Calendar.getInstance();
        cal.setTime(entrega);
        if(tempo.equals("dias")) {
            cal.add(Calendar.DAY_OF_MONTH, arg1);
        }
        if(tempo.equals("meses")) {
            cal.add(Calendar.MONTH, arg1);
        }
        entrega = cal.getTime();
    }

    @Então("^a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
    public void aEntregaSeráEfetuadaEm(String data) throws Throwable {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = format.format(entrega);
        Assert.assertEquals(data, dataFormatada);
    }
}
