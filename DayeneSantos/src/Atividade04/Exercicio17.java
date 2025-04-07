/* Exercicio17 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/26
 */
package Atividade04;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, unidade, dezena, centena;
		
		System.out.print("Digite um número de três dígitos: ");
			numero = sc.nextInt();
			
		unidade = numero % 10;
		dezena = (numero / 10) % 10;
		centena = (numero / 100) % 10;
		
		System.out.println("Número invertido: " + unidade + dezena + centena);
	
		sc.close();

	}

}
