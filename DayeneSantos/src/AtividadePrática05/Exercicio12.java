/* Exercicio12 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/04/01 
 */
package AtividadePrática5;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua idade para saber sua classe eleitoral: ");
			idade = sc.nextInt();
		
		if(idade < 16) {
			System.out.print("Você ainda não tem idade para votar!");
		} else if(idade >= 18 && idade <=65 ) {
			System.out.print("Por lei, você é obrigado a votar!");
		} else if(idade > 16 && idade < 18) {
			System.out.println("Você não tem obrigatoriedade de ir votar. Em sua idade o voto é facultativo!");
		} else {
			System.out.println("Você não tem obrigatoriedade de ir votar. Em sua idade o voto é facultativo!");
		}	
		sc.close();

	}

}
