/* Exercicio08 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/25
 */
package Atividade04;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.print("Digite seu nome: ");
			nome = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
			idade = sc.nextInt();
	
			System.out.printf("Seu nome é %s, e você tem %d anos.", nome, idade);	
		
		sc.close();

	}

}
