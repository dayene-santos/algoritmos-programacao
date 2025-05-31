/* Exercicio06 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/30
 */
package Atividade08;

import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeros = new int[10];
        int[] ordemCrescente = new int[numeros.length];
        int temporaria;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        for (int i = 0; i < numeros.length; i++) {
            ordemCrescente[i] = numeros[i];
        }

        for (int i = 0; i < ordemCrescente.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (ordemCrescente[j] > ordemCrescente[j + 1]) {
                    temporaria = ordemCrescente[j];
                    ordemCrescente[j] = ordemCrescente[j + 1];
                    ordemCrescente[j + 1] = temporaria;
                }
            }
        }
        System.out.println("Números iniciais: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\n\nNúmeros Ordenados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(ordemCrescente[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
