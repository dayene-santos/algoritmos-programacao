/* Exercicio16 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/26
 */
package Atividade04;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int dividendo, divisor, resultado, resto;
		
		System.out.print("Digite o valor do dividendo: ");
			dividendo = sc.nextInt();
			
		System.out.print("Digite o valor do divisor: ");
			divisor = sc.nextInt();
			
		resultado = dividendo / divisor;
		resto = dividendo % divisor;
		
		System.out.printf("Os valores informados foram: %d e %d\n", dividendo, divisor);
		System.out.printf("O resultado da divisão é: %d, e o resto dessa divisão é: %d", resultado, resto);
	
		sc.close();
	}

}