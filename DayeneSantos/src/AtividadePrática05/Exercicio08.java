/* Exercicio08 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/31 
 */

package AtividadePrática5;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("Digite um número: ");
			num = sc.nextInt();
			
		if(num > 0) {
			System.out.printf("O número %d é Positivo.", num);
		} else {
			System.out.printf("O número %d é Negativo", num);
		}
		
		sc.close();

	}

}
