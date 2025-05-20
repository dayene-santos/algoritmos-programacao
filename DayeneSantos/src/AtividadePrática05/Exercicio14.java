/* Exercicio14 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/04/07 
 */
package AtividadePrática5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        int[] numeros = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        boolean repetido = false;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    repetido = true;
                    break;
                }
            }
        }

        if (repetido) {
            System.out.println("Erro: os números devem ser diferentes.");
        } else {

        	Arrays.sort(numeros);
            System.out.println("Números em ordem crescente:");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
	