/* Exercicio02 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/24 
 */
package Atividade04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int quantidade;
		double precoCusto, valorTotal;
		
		System.out.print("Insira a quantidade de itens: ");
			quantidade = sc.nextInt();
			
		System.out.print("Insira o preço de custo: R$ ");
			precoCusto = sc.nextDouble();
			
			valorTotal = quantidade * precoCusto;
			
		System.out.printf("O custo final de todos os itens foi de R$ %.2f", valorTotal);
		
		sc.close();
	}

}
