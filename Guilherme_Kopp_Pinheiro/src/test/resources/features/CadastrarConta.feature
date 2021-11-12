#language: pt
#encoding: UTF-8

@CadastrarConta
Funcionalidade: Cadastrar Conta

@criarConta
Cenario: criar conta
    Quando eu acionar a aba sign in
    E informar no campo email address "testandoo1978@gmail.com"
    E acionar o botao create an account
    E o usuario informar o first name "Marc"
    E informar o last name "Vincent"
    E informar o password "JonhJohn"
    E informar o address "street john, 14"
    E informar a city "Catania"
    E informar o zip/postal code "00000"
    E selecionar o country
    E informar o mobile phone "888888888"
    E acionar o botao register
    Entao o sistema deve cadastrar o usuario "Marc"