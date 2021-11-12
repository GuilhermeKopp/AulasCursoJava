import java.util.Scanner;

public class DescontoINSS {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;

        System.out.println("Salario do Funcionario:");
        salario = entrada.nextDouble();

        if( salario <= 600){
            System.out.println("Isento");
        }

        if( salario > 600 && salario <= 1200 ){

            System.out.println("Desconto do INSS é "+ (salario *20)/100);
        }

        if( salario > 1200 && salario <= 2000){
            System.out.println("Desconto do INSS é " + (salario *25 )/100);
        }

        if( salario > 2000 ){
            System.out.println("Desconto do INSS é "+ (salario * 30)/100);
        }
    }



}