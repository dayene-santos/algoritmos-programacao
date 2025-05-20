/* Exercicio16 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/04/07 
 */
package AtividadePrática5;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        double deposito, taxaJuros, taxaDecimal, rendimento1, rendimento2, rendimento3, total1, total2, total3;
        
        System.out.print("Digite o valor do depósito: R$ ");
        deposito = sc.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        taxaJuros = sc.nextDouble();

        taxaDecimal = taxaJuros / 100;

        total1 = deposito * Math.pow(1 + taxaDecimal, 1);
        rendimento1 = total1 - deposito;

        total2 = deposito * Math.pow(1 + taxaDecimal, 2);
        rendimento2 = total2 - deposito;

        total3 = deposito * Math.pow(1 + taxaDecimal, 3);
        rendimento3 = total3 - deposito;

        System.out.printf("\nApós 1 mês: Rendimento = R$ %.2f - Total = R$ %.2f\n", rendimento1, total1);
        System.out.printf("Após 2 meses: Rendimento = R$ %.2f - Total = R$ %.2f\n", rendimento2, total2);
        System.out.printf("Após 3 meses: Rendimento = R$ %.2f - Total = R$ %.2f\n", rendimento3, total3);

        sc.close();
		
	}

}
