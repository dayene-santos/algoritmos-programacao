package Atividade03;

import java.util.Scanner;

public class Exercicio07 {		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int num1;
			double num2, soma;
			
			System.out.println("Digite um número inteiro: ");
				num1 = sc.nextInt();
				
			System.out.println("Digite um número com casa decimal: ");
				num2 = sc.nextDouble();
				
				soma = num1 + num2;
				
			System.out.printf("A soma entre os dois valores é de: %.2f%n", soma);
			
			
			sc.close();
	}

}
