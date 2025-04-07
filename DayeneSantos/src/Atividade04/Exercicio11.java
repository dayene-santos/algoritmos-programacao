/* Exercicio11 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/26
 */

package Atividade04;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char letra1, letra2, letra3, letra4, letra5;
		
		System.out.print("Digite a primeira letra: ");
			letra1 = sc.nextLine().charAt(0);
		
		System.out.print("Digite a segunda letra: ");
			letra2 = sc.nextLine().charAt(0);
			
		System.out.print("Digite a terceira letra: ");
			letra3 = sc.nextLine().charAt(0);
		
		System.out.print("Digite a quarta letra: ");
			letra4 = sc.nextLine().charAt(0);
		
		System.out.print("Digite a quinta letra: ");
			letra5 = sc.nextLine().charAt(0);	
			
		System.out.printf("Veja as letras digitadas lado a lado: %c, %c, %c, %c, %c.\n", letra1, letra2, letra3, letra4, letra5);
		System.out.printf("Veja as letras digitadas uma abaixo da outra: \n %c \n %c \n %c \n %c \n %c \n", letra1, letra2, letra3, letra4, letra5);	
		
		sc.close();

	}

}