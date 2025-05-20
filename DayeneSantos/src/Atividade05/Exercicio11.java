/* Exercicio11 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/04/01 
 */
package AtividadePrática5;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario, aumento;
		
		System.out.print("Digite o valor do seu salário atual: R$");
			salario = sc.nextDouble();
			
		if(salario < 500) {
			aumento = salario * 0.15;
			salario = salario + aumento;
		} else if (salario > 500 && salario <= 1000) {
			aumento = salario * 0.10;
			salario = salario + aumento;
		} else {
			aumento = salario * 0.05;
			salario = salario + aumento;
		}
		
		System.out.printf("Seu novo salário após o reajuste é de R$%.2f\n", salario);
				
		sc.close();

	}

}
