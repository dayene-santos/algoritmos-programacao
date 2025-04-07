/* Exercicio04 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/24 
 */
//4-) Escreva um programa em Java que leia uma temperatura na escala Celsius (C) e imprima o equivalente
//em Fahrenheit (F). Dados: (Fórmula de conversão: F = ((C * 9/5) + 32) */

package Atividade04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double celsius, fahrenheit;
		
		System.out.print("Digite a temperatura em Celsius: ");
			celsius = sc.nextDouble();
			
			fahrenheit = ((celsius * 9/5) + 32);
			
		System.out.printf("A temperatura %.1fº Celsius em Fahrenheit é: %.1f", celsius, fahrenheit);
		
		sc.close();

	}

}
