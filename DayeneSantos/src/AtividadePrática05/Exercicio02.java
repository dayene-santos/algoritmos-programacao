/* Exercicio02 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/31 
 */

package AtividadePrática5;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Digite dois números: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
		if(x > y) {
			System.out.printf("O maior valor é: %d", x);
		} else if (y > x){
			System.out.printf("O maior valor é: %d", y);
		} else {
			System.out.println("Os números são iguais!");
		}
		
		sc.close();

	}

}
