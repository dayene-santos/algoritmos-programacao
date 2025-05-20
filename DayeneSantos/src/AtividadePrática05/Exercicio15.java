/* Exercicio15 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/04/07 
 */
package AtividadePrática5;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio15 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        boolean repetido = false;
        if (numeros[0] == numeros[1] || numeros[0] == numeros[2] || numeros[1] == numeros[2]) {
            repetido = true;
        }

        if (repetido) {
            System.out.println("Erro: os números devem ser diferentes.");
        } else {
            Arrays.sort(numeros);

            System.out.println("Números em ordem decrescente:");
            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.print(numeros[i] + " ");
            }
        }

        sc.close();
		
	}

}
