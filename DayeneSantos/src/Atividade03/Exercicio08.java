package Atividade03;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char letra;
		int num;
		
		System.out.println("Digite uma letra: ");
			letra = sc.nextLine().charAt(0);
		
		System.out.println("Digite um número inteiro: ");
			num = sc.nextInt();
			
		System.out.println("A letra digitada foi: " + letra);
		System.out.println("O número digitado foi: " + num);
		
		sc.close();

	}

}
