/* Exercicio08 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/31
 */
package Atividade08;

import java.util.Random;

public class Exercicio08 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[] numeros = new int[10];
        int maior=Integer.MIN_VALUE;  // inicializa 'maior' com o menor valor possível
        int menor = Integer.MAX_VALUE; // inicializa 'menor' com o maior valor possível

        // Preenche vetor com números aleatórios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(100) + 1;
        }
        // Exibe os números gerados
        System.out.println("Os números do vetor de 10 posições são:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n-------------------------------------------");
        // Encontra o menor e maior valor
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Exibe posições do maior e do menor
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == maior) {
                System.out.println("Maior número: " + maior + " (posição " + i + ")");
            }
            if (numeros[i] == menor) {
                System.out.println("Menor número: " + menor + " (posição " + i + ")");
            }
        }
    }
}