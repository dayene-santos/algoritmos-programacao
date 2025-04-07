package Atividade03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		double num1, num2, produto;
		
		System.out.println("Digite dois números que contenha casa decimal: ");
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			
			produto = num1 * num2;
			
		System.out.printf("O produto entre os números digitados é: %.2f%n", produto);
		
		sc.close();
	}

}
