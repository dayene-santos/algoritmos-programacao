/* Exercicio08 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/25
 */

package Atividade04;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double prestacao, juros, valorComJuros, desconto, valorFinal, prejuizo;
		
		System.out.print("Digite o valor da prestação: R$ ");
			prestacao = sc.nextDouble();
			
			juros = prestacao * 0.15;
			valorComJuros = prestacao + juros;
			
			desconto = valorComJuros * 0.15;
			valorFinal = valorComJuros - desconto;
			
			prejuizo = prestacao - valorFinal;
			
		System.out.printf("O valor final a pagar é de R$ %.2f\n", valorFinal);
		System.out.printf("O valor do prejuízo é de: R$ %.2f\n", prejuizo);
		
		sc.close();

	}

}
