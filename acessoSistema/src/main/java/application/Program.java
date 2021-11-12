package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.print("Login: ");
		String login = sc.nextLine();
	
		System.out.print("Senha: ");
		String senha = sc.nextLine();
		
		if(login.equals("grupojava") && senha.equals("senhagrupojava")){
            System.out.printf("Usuário %s logado com sucesso.", login);
        }else{
            System.out.println("Login ou senha inválidos!");
        }	
	}
}
