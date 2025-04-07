/* Exercicio10 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/25
 */
package Atividade04;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		double altura;
		
		System.out.print("Digite uma idade: ");
			idade = sc.nextInt();
			
		System.out.print("Digite uma altura: ");
			altura = sc.nextDouble();
			
		System.out.printf("A idade digitada foi: %d anos, e a altura digitada foi %.2f de altura\n", idade, altura);
		
		sc.close();
	}

}