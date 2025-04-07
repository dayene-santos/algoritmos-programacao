package Atividade03;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char letra;
		int num;
		
		System.out.println("Digite uma letra: ");
			letra = sc.nextLine().charAt(0);
		
		System.out.println("Digite um número inteiro: ");
			num = sc.nextInt();
			
		System.out.printf("A letra digitada foi: %c, e o número digitado foi: %d ", letra, num);
		
		sc.close();

	}

}
