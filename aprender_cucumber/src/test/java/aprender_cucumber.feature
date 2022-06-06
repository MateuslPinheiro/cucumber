#language: pt
Funcionalidade: Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar critérios de aceitação

  Cenário: Deve executar especificação
    Dado que criei o arquivo corretamente
    Quando executá-lo
    Então a especificação deve finalizar com sucesso

  Cenário: Deve incrementar contador
    Dado que o valor do contador é 15
    Quando eu incrementar em 5
    Então o valor do contador será 20

  Cenário: Deve incrementar contador
    Dado que o valor do contador é 123
    Quando eu incrementar em 35
    Então o valor do contador será 158

  Cenário: Deve calcular atraso na entrega
    Dado que a entrega é dia 06/06/2022
    Quando a entrega atrasar em 2 dias
    Então a entrega será efetuada em 08/06/2022

  Cenário: Deve calcular o atraso no prazo de entrega da China
    Dado que a entrega é dia 06/06/2022
    Quando a entrega atrasar em 2 meses
    Então a entrega será efetuada em 06/08/2022