/* Exercicio17 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/04/01 
 */

package AtividadePrática5;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario_bruto, desconto, salario_liquido;
		
		System.out.print("Digite o valor do Salário Bruto: R$");
			salario_bruto = sc.nextDouble();
			
		if(salario_bruto <= 1100) {
			desconto = salario_bruto * 0.075;
			salario_liquido = salario_bruto - desconto;
		} else if(salario_bruto > 1100 && salario_bruto <=2203.48) {
			desconto = salario_bruto * 0.09;
			salario_liquido = salario_bruto - desconto;
		} else if(salario_bruto > 2203.48 && salario_bruto <= 3305.22) {
			desconto = salario_bruto * 0.12;
			salario_liquido = salario_bruto - desconto;
		} else {
			desconto = salario_bruto * 0.14;
			salario_liquido = salario_bruto - desconto;
		}
		
		System.out.printf("O valor de desconto do INSS referente ao seu salário é de: R$%.2f\n", desconto);
		System.out.printf("O valor do seu salário após o desconto é de: R$%.2f", salario_liquido);

		sc.close();
	}

}
