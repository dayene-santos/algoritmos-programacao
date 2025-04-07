/* Exercicio07 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/25
 */

package Atividade04;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtdeComodos=6, areaComodo=10, areaTotal, litrosNecessarios, latasNecessarias;
		double precoLata=50.0, custoTotal;
		
		areaTotal = qtdeComodos * areaComodo;
		litrosNecessarios = areaTotal/3;
		latasNecessarias = litrosNecessarios/5;
		custoTotal = latasNecessarias * precoLata;
		
		System.out.printf("A quantidade necessária para pintar %d comodos de %d metros é de %d latas.\n", qtdeComodos, areaComodo, latasNecessarias);
		System.out.printf("O custo total será de R$ %.2f", custoTotal);
			
		sc.close();
	}

}
