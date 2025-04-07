package Atividade03;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num;
		
		System.out.println("Digite um número real: ");
			num = sc.nextDouble();
			
			
		System.out.printf("A raiz quadrada do número %.2f é %.2f ", num, Math.sqrt(num));
		
		
		sc.close();
	}

}
