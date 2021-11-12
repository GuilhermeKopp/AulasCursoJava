#language: pt
#enconding: UTF-8

Funcionalidade: Login

Cenario: Usuario inválido
Quando eu informar o usuário "ad"
E informar a senha "asd"
E clicar no botão login
Entao o sistema exibe a mensagem de usuário inválido