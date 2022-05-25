#language: pt
#enconding: UTF-8

@LogIn
Funcionalidade: realiazr log-in

  @logIn
  Cenario: log-in sucesso
    Quando eu informar no campo username "WS_USU_1"
    E informar no campo senha "12345678"
    E clicar no botao acessar
    Entao o sistema exibe que o usuario esta logado
