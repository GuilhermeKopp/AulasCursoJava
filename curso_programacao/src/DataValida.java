import java.util.Scanner;

public class DataValida {

    public static void main(String[] args) {

        //entrada de dados

        Scanner tec = new Scanner(System.in);

        //atributos

        int dia, mes, ano;



        //entrada da data

        System.out.print("Digite o dia: ");

        dia = tec.nextInt();

        System.out.print("Digite o mês: ");

        mes = tec.nextInt();

        System.out.print("Digite o ano: ");

        ano = tec.nextInt();

        System.out.print(dia + "/" + mes + "/" + ano);



        //verificando se a data é válida

        if(ano>0){

            if(mes>=1 && mes<=12){

                if(mes==1 || mes ==3 || mes==5 || mes==7 || mes==8

                        || mes==10 || mes==12){

                    if(dia >=1 && dia <= 31){

                        System.out.println(" é uma data válida!");



                    }    else{

                        System.out.println(" não é uma data válida!");

                    }



                }else if(mes==4 || mes==6 || mes==9 || mes==11){

                    if(dia>=1 && dia<=30){

                        System.out.println(" é uma data válida!");

                    }else{

                        System.out.println(" não é uma data válida!");

                    }

                }else if((ano%4==0 && ano%100!=0)||(ano%400==0)){

                    if(mes==2){

                        if(dia>=1 && dia<=29){

                            System.out.println(" é uma data válida!");

                        }else{

                            System.out.println(" não é uma data válida!");

                        }

                    }

                }else if(ano%4!=0){

                    if(mes==2){

                        if(dia>=1 && dia<=28){

                            System.out.println(" é uma data válida!");

                        }else{

                            System.out.println(" não é uma data válida!");

                        }

                    }

                }



            }

        }}}

