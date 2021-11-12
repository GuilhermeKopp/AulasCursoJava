import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Quantos titulos seu time possui no total?");
	
	int titulos;
	titulos = teclado.nextInt();
	
	if (titulos >= 20) {
		System.out.println("Seu time é gigante como o Flamengo");
	} else if (titulos <= 19 && titulos >= 10) {
		System.out.println("Seu time é grande");
	} else
		System.out.println("Seu time não é bom o bastante");
    }
	
}