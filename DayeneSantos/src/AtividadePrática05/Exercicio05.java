/* Exercicio05 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/31 
 */

package AtividadePrática5;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.println("Digite sua senha de acesso: ");
			senha = sc.nextInt();
		
		if(senha != 4531) {
			System.out.print("Acesso Negado! Senha inválida, tente novamente");
		} else {
			System.out.print("Acesso Permitido, Seja Bem Vindo!");
		}
		
		sc.close();
	}

}
