import java.util.Scanner;

public class WhileDes {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Olá! Com qual combustível o sr(a) deseja abastecer?");
		
		int alcool = 0;
		int gasolina = 0;
		int etanol = 0;
		int x = teclado.nextInt();
		
		while (x != 4) {
			if (x == 0) {
				System.out.println("Código inválido! Digite um novo código:");
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
