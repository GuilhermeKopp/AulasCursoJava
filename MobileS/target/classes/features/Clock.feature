#language: pt
#enconding: UTF-8

Funcionalidade: Clock mobile

Eu como um usuario gostaria de adicionar um novo alarme para que eu acorde mais cedo no dia seguinte

Cenario: Adicionar novo alarme

Dado que o usuario acione o menu alarme
Quando o ususario acionar o botao adicionar alarme
E configurar a hora para "5:20","PM"
Entao o app adiciona um novo alarme com as infromaçoes
|Repeat                   |
|Default (Cesium)         |
|Label                    |
|Google Assistant Routine |
|Delete                   |