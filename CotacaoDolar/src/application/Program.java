package application;

import java.util.Scanner;

import entities.Dolar;

public class Program {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
			
		System.out.println("Digite a quantidade de dolares que voc� deseja: ");
		double qtdDolar = teclado.nextDouble();
		
		System.out.printf("O pre�o em reais ficar�: R$ %.2f%n", Dolar.conversao(qtdDolar));
	}

}
