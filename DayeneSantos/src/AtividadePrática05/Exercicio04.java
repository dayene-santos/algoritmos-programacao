/* Exercicio04 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/07/04 
 */
package AtividadePrática5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, num4;
		
        System.out.print("Digite o primeiro número (menor): ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        num2 = sc.nextInt();

        System.out.print("Digite o terceiro número (maior que o segundo): ");
        num3 = sc.nextInt();
        
        if (num1 >= num2 || num2 >= num3) {
            System.out.println("Erro: os três primeiros números devem estar em ordem crescente.");
            sc.close();
            return; 
        } 
        
        System.out.print("Digite o quarto número (fora da ordem): ");
        num4 = sc.nextInt();

        int[] numeros = {num1, num2, num3, num4};

        Arrays.sort(numeros);

        System.out.println("Números em ordem decrescente:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
	
        sc.close();
	}

 }