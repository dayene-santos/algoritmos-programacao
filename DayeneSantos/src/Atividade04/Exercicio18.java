/* Exercicio18 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/26
 */
package Atividade04;

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = 30, valor2 = 15, multiplicacao, subtracao;
		
		multiplicacao = valor1 * valor2;
		subtracao = valor1 - valor2;
		
		System.out.println("O produto entre os valores 1 e 2 é de: " + multiplicacao);
		System.out.println("A subtração entre os valores 1 e 2 é de: " + subtracao);
		
		sc.close();
	}

}


