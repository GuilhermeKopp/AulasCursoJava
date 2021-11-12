package application;

import java.util.Scanner;

import entities.Student;

public class Notas {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Digite o nome do Aluno: ");
		String aluno = sc.next();
		
		System.out.println("Digite as notas do Aluno: " + aluno);
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		if (student.finalGrade() < 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}
		else {
		System.out.println("PASS");
		}
		sc.close();

		
	}	
	
}
