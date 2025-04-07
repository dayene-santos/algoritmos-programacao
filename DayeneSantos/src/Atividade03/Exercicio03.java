package Atividade03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char letra;
		
		System.out.print("Digite uma letra: ");
			letra = sc.nextLine().charAt(0);
			
		System.out.print("A letra digitada foi: " + letra);		
		
		sc.close();

	}

}