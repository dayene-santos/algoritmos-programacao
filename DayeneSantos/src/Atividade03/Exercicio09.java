package Atividade03;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean atv1, atv2, atividades;
		
		System.out.println("Digite true para sim, e false para não: ");
		
		System.out.print("A atividade prática 1 foi enviada? ");
			atv1 = sc.nextBoolean();
			
		System.out.print("A atividade prática 2 foi enviada? ");
			atv2 = sc.nextBoolean();
			
		atividades = atv1 && atv2;
			
		System.out.println("Todas as atividades foram enviadas? " + atividades);
		
		
		sc.close();
	}

}
