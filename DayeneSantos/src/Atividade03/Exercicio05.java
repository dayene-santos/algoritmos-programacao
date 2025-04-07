package Atividade03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.println("Digite dois números inteiros: ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			soma = num1 + num2;
			
		System.out.println("O resultado é: " + soma);	
		
		sc.close();

	}

}