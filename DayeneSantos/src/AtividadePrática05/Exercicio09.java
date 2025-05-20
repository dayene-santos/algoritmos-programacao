/* Exercicio09 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/04/01 
 */

package AtividadePrática5;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a idade para saber a qual categoria pertence: ");
			idade = sc.nextInt();
			
		if(idade < 5) {
			System.out.print("");
		} else if(idade >= 5 && idade <=7) {
			System.out.print("Infantil");
		} else if(idade >= 8 && idade <= 10) {
			System.out.print("Juvenil");
		} else if(idade >= 11 && idade <= 15) {
			System.out.print("Adolescente");
		} else if(idade >= 16 && idade <=30) {
			System.out.print("Adulto");
		} else {
			System.out.print("Sênior");
		}
		
		sc.close();

	}

}
