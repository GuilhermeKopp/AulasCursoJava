import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Programando Java");

		int idade = 22;
		double altura = 1.78;
		String nome = "Guilherme Kopp Pinheiro";
		
		System.out.println("Ol�! Meu nome � " + nome + ", tenho " + idade + " anos e minha altura � " + altura);
	
		String x;
		x = teclado.next();
		
		System.out.println("Eu me formei em: " + x);
		
		double y;
		y = teclado.nextDouble();
		
		System.out.println("Eu comprei: " + y + " Tortas!");
		
	}

}
