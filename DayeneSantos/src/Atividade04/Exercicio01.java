/* Exercicio01 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/24 
 */
package Atividade04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, quadrado;
		
		System.out.print("Digite um número: ");
			num = sc.nextInt();
			
		quadrado = num * num;
		
		System.out.printf("O quadrado do número %d é: %d ", num, quadrado);
		
		sc.close();

	}

}
