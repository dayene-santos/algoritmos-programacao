package Atividade03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		double num;
		
		System.out.println("Digite um número que contenha casa decimal: ");
			num = sc.nextDouble();
			
		System.out.println("O número digitado foi: " + num);
		
		sc.close();

	}

}