import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
        System.out.println("Novo usu�rio");
		
		String nome;
		System.out.println("Digite seu nome*");
		nome = teclado.next();
		
		String ultNome;
		System.out.println("Digite seu ultimo Nome*");
		nome = teclado.next();
		
		String email;
		System.out.println("Digite seu e-mail*");
		email = teclado.next();

		String endereco;
		System.out.println("Digite seu endere�o");
		endereco = teclado.next();
		
		String universidade;
		System.out.println("Digite sua universidade");
		universidade = teclado.next();
		
		String profissao;
		System.out.println("Digite sua profiss�o");
		profissao = teclado.next();
		
		String genero;
		System.out.println("Digite seu gen�ro");
		genero = teclado.next();
		
		int idade;
		System.out.println("Digite sua idade"); 
		idade = teclado.nextInt();
		
		int x;
		
	    System.out.println("Digite 1 para confirmar o seu cadastro, digite 2 caso queira alter�-lo.");
	    x = teclado.nextInt();
	    
	    while (x == 2) {
	    if (x != 1) {
	    	System.out.println("Digite seu nome*");
		    nome = teclado.next();
		    
		    System.out.println("Digite seu ultimo Nome*");
			nome = teclado.next();
			
			System.out.println("Digite seu e-mail*");
			email = teclado.next();
			
			System.out.println("Digite seu endere�o");
			endereco = teclado.next();
			
			System.out.println("Digite sua universidade");
			universidade = teclado.next();
			
			System.out.println("Digite sua profiss�o");
			profissao = teclado.next();
			
			System.out.println("Digite seu gen�ro");
			genero = teclado.next();
			
			System.out.println("Digite sua idade"); 
			idade = teclado.nextInt();
	    } else
	    	System.out.println("Seu cadastro foi realizado com sucesso!!");
	}
	}
	}

