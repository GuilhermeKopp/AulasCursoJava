$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CadastrarConta.feature");
formatter.feature({
  "name": "Cadastrar Conta",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@CadastrarConta"
    }
  ]
});
formatter.scenario({
  "name": "criar conta",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@CadastrarConta"
    },
    {
      "name": "@criarConta"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar a aba sign in",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastrarContaSteps.eu_acionar_a_aba_sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar no campo email address \"testandoo1978@gmail.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarContaSteps.informar_no_campo_email_address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao create an account",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarContaSteps.acionar_o_botao_create_an_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar o first name \"Marc\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarContaSteps.oUsuarioInformarOFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o last name \"Vincent\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarContaSteps.informar_o_last_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o password \"JonhJohn\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarContaSteps.informar_o_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o address \"street john, 14\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarContaSteps.informar_o_address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a city \"Catania\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarContaSteps.informar_a_city(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o zip/postal code \"00000\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarContaSteps.informar_o_zip_postal_code(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar o country",
  "keyword": "E "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "informar o mobile phone \"888888888\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarContaSteps.informar_o_mobile_phone(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "acionar o botao register",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarContaSteps.acionar_o_botao_register()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "o sistema deve cadastrar o usuario \"Marc\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastrarContaSteps.o_sistema_deve_cadastrar_o_usuario(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});