$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LogIn.feature");
formatter.feature({
  "name": "realiazr log-in",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@LogIn"
    }
  ]
});
formatter.scenario({
  "name": "log-in sucesso",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@LogIn"
    },
    {
      "name": "@logIn"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu informar no campo username \"WS_USU_1\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LogInSteps.euInformarNoCampoUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar no campo senha \"12345678\"",
  "keyword": "E "
});
formatter.match({
  "location": "LogInSteps.informarNoCampoSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao acessar",
  "keyword": "E "
});
formatter.match({
  "location": "LogInSteps.clicarNoBotaoAcessar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe que o usuario esta logado",
  "keyword": "Entao "
});
formatter.match({
  "location": "LogInSteps.oSistemaExibeQueOUsuarioEstaLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});