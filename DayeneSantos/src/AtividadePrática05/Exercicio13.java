/* Exercicio13 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/04/01 
 */
package AtividadePrática5;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Digite o valor de A: ");
			a = sc.nextInt();
		System.out.print("Digite o valor de B: ");
			b = sc.nextInt();
			
		if(a == b) {
			c = a + b;
			System.out.println("O valor atribuido a variável A foi: " + a);
			System.out.println("O valor atribuido a variável B foi: " + b);
			System.out.println("A soma desses dois valores atribuido a variável C é: " + c);
		} else {
			c = a * b;
			System.out.println("O valor atribuido a variável A foi: " + a);
			System.out.println("O valor atribuido a variável B foi: " + b);
			System.out.println("O produto desses dois valores atribuidos a variável C é: " + c);
		}
			
		sc.close();
	}

}
