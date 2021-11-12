import java.util.Scanner;

public class tnumbers {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num = 0;
		int maiorNum = 0;
		
		System.out.println("Digite 3 Números: ");
		
		for (int i = 0; i < 3; i++) {
		num = teclado.nextInt();
		
		if (num > maiorNum) {
			maiorNum = num; 
		}
		}
		
		System.out.println("O maior número digitado foi: " + maiorNum);
	}


}
