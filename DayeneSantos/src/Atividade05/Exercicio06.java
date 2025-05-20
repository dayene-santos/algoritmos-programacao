/* Exercicio06 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/31 
 */

package AtividadePrática5;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número: ");
			num = sc.nextInt();
			
		if(num % 2 == 0) {
			System.out.printf("O número %d é Par.", num);
		} else {
			System.out.printf("O número %d é Impar.", num);
		}
			
		sc.close();
	}

}
