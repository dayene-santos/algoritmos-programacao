/* Exercicio06 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/25
 */

package Atividade04;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double porcentagemDistribuidor, imposto, custoFabrica, valorPago;
		
		System.out.print("Qual o valor do custo de Fábrica? R$ ");
			custoFabrica = sc.nextDouble();

		porcentagemDistribuidor = custoFabrica * 0.12;
				
		imposto = custoFabrica * 0.45;
		
		valorPago = custoFabrica + porcentagemDistribuidor + imposto;
		
		System.out.printf("O valor pago à distribuidora é de: R$ %.2f%n", porcentagemDistribuidor);
        System.out.printf("O valor pago de impostos é de: R$ %.2f%n", imposto);
        System.out.printf("O custo total do consumidor é de: R$ %.2f%n", valorPago);
        
		sc.close();
	}

}