/* Exercicio05 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/27
 */
package Atividade08;

import java.util.Random;

public class Exercicio05 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeros = new int[20];
        int pares = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;

            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }
        System.out.print("\nOs números do vetor são: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", "); // vírgula só entre os números, não no final
            }
        }
        System.out.println("\nDesses números, " + pares + " são pares.");
        System.out.println("Sendo eles: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i]);
                if (i < numeros.length - 1) {
                    System.out.print(", "); // vírgula só entre os números, não no final
                }
            }
        }
    }
}