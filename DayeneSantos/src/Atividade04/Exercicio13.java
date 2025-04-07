/* Exercicio13 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/26
 */
package Atividade04;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1, num2, num3, num4, num5, soma, media;
		
		System.out.print("Digite o primeiro valor: ");
			num1 = sc.nextDouble();
			
		System.out.print("Digite o segundo valor: ");
			num2 = sc.nextDouble();
		
		System.out.print("Digite o terceiro valor: ");
			num3 = sc.nextDouble();
			
		System.out.print("Digite o quarto valor: ");
			num4 = sc.nextDouble();
			
		System.out.print("Digite o quinto valor: ");
			num5 = sc.nextDouble();
			
			soma = num1 + num2 + num3 + num4 + num5;
			media = soma / 5;
			
			System.out.printf("A soma dos valores inseridos é de: %.2f, e a média desses valores é de: %.2f", soma, media);		
			
		sc.close();

	}

}
