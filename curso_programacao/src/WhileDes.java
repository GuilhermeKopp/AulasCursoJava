import java.util.Scanner;

public class WhileDes {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ol�! Com qual combust�vel o sr(a) deseja abastecer?");
		
		int alcool = 0;
		int gasolina = 0;
		int etanol = 0;
		int x = teclado.nextInt();
		
		while (x != 4) {
			if (x == 0) {
				System.out.println("C�digo inv�lido! Digite um novo c�digo:");
			} else if (x == 1) {
				System.out.println("Alcool");
				alcool = alcool + 1;
			} else if (x == 2) {
				System.out.println("Gasolina");
				gasolina = gasolina + 1;
			} else if (x == 3) {
			    System.out.println("Etanol");
			    etanol = etanol + 1;
			}
			    x = teclado.nextInt();
		}
			    System.out.println("Muito Obrigado!");
			    System.out.println("Alcool: " + alcool);
				System.out.println("Gasolina: " + gasolina);
				System.out.println("Diesel: " + etanol);
	}
}
