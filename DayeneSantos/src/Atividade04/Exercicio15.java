/* Exercicio15 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/26
 */
package Atividade04;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, soma, produto;
		
		System.out.print("Digite o primeiro número: ");
			num1 = sc.nextInt();
		System.out.println("");
			
		System.out.print("Digite o segundo número: ");
			num2 = sc.nextInt();
		System.out.println("");
		
		System.out.print("Digite o terceiro número: ");
			num3 = sc.nextInt();
		System.out.println("");
		
		soma = num1 + num2 + num3;
		produto = num1 * num2 * num3;
		
		System.out.print("A soma dos números é de: " + soma);
		System.out.println("\n");
		
		System.out.print("O produto dos números inseridos é: " + produto);
		System.out.println("");
		
		sc.close();
	}

}