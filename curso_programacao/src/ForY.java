import java.util.Scanner;

public class ForY {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite os titulos do flamengo na seguinte ordem:");
		System.out.println("Brasileir�o, Copa do Brasil, Supercopa, Recopa, Libertadores, Mundial, Mercosul, outros");
		
		int soma = 0;
		
		int x = 8;
		
		for (int i = 0; i < x; i++ ) {
			int titulos = teclado.nextInt();	
		    System.out.println(soma = soma + titulos);
		}
		
		System.out.println("O flamengo tem " + soma + " titulos de relev�ncia, � o maior campe�o do Brasil!");
	}

}
