/* Exercicio18 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/04/01 
 */

package AtividadePrática5;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double peso, altura, imc;
		
		System.out.println("Qual é o seu nome? ");
			nome = sc.nextLine();
		
		System.out.print("Por favor digite seu peso: ");
			peso = sc.nextDouble();
		
		System.out.print("Por favor digite sua altura: ");
			altura = sc.nextDouble();
			
		imc = peso / (altura * altura);
		
		if(imc < 20) {
			System.out.printf("Olá %s, de acordo com seu IMC de %.2f, você está abaixo do peso.", nome, imc);
		
		} else if (imc >= 20 && imc < 25) {
			System.out.printf("Olá %s, de acordo com seu IMC de %.2f, você está com o peso ideal.", nome, imc);
		
		} else if(imc >= 25 && imc < 30) {
			System.out.printf("Olá %s, de acordo com seu IMC de %.2f, você está com excesso de peso.", nome, imc);
			
		} else if(imc >= 30 && imc < 35) {
			System.out.printf("Olá %s, de acordo com seu IMC de %.2f, você está com obesidade.", nome, imc);

		} else {
			System.out.printf("Olá %s, de acordo com seu IMC de %.2f, você está com obesidade mórbida.", nome, imc);

		}
		
		sc.close();

	}

}
