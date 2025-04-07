/* Exercicio03 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/24 
 */
package Atividade04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double baseMaior, baseMenor, altura, area;
		
		System.out.print("Insira o valor da base maior: ");
			baseMaior = sc.nextDouble();
			
		System.out.print("Insira o valor da base menor: ");
			baseMenor = sc.nextDouble();
			
		System.out.print("Insira o valor da altura: ");
			altura = sc.nextDouble();
			
		area = ((baseMaior + baseMenor) * altura) /2;
		
		System.out.printf("A área desse trapézio é de %.2f", area);
		
		
		sc.close();

	}

}