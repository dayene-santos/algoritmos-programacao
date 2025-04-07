package Atividade03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean resposta;
		
		System.out.println("Digite 'true' para SIM ou 'false' para NÃO:");
        System.out.println("Você está gostando do Curso de ADS da Newton Paiva Wyden?");
        
			resposta = sc.nextBoolean();

        System.out.print("Você respondeu: " + resposta);
		

		sc.close();

	}

}