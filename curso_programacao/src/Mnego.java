import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Mnego {

	public static void main(String[] args) throws ParseException {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos titulos do brasileirão o Flamengo possui? ");
		int br = teclado.nextInt();
		
		System.out.println("Quantas libertadores o Flamengo possui? ");
		int libertadores = teclado.nextInt();
		
		System.out.println("Quantas copa do Brasil o Flamengo possui? ");
		int copaBr = teclado.nextInt();
		     
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Date data1 = sdf1.parse("25/02/2021");
		Date data2 = sdf1.parse("23/11/2019");
		Date data3 = sdf1.parse("27/11/2013");
		
		System.out.println("O o ultimo titulo br foi em: " + sdf1.format(data1));
		System.out.println("O o ultimo titulo da libertadores foi em: " + sdf1.format(data2));
		System.out.println("O o ultimo titulo da copa do Brasil foi em: " + sdf1.format(data3));
		
		for(int i = 10; i>=0; i--) {
			System.out.println("Contagem regressiva: " + i);
        }
	}
}
