/* Exercicio06 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/30
 */
package Atividade08;

import java.util.Random; // Importa a classe Random para gerar números aleatórios

public class Exercicio06 {
    public static void main(String[] args) {
        Random random = new Random(); // Cria um objeto da classe Random para gerar números aleatórios

        int[] numeros = new int[10]; // Cria um vetor de inteiros com 10 posições para armazenar os números aleatórios

        int[] ordemCrescente = new int[numeros.length]; // Cria outro vetor com o mesmo tamanho para armazenar os números em ordem crescente

        int temporaria; // Variável temporária usada na troca de valores durante a ordenação

        // Preenche o vetor 'numeros' com valores aleatórios entre 0 e 99
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        // Copia os valores do vetor 'numeros' para o vetor 'ordemCrescente'
        for (int i = 0; i < numeros.length; i++) {
            ordemCrescente[i] = numeros[i];
        }

        // Ordena os valores do vetor 'ordemCrescente' usando o algoritmo Bubble Sort
        for (int i = 0; i < ordemCrescente.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {

                // Compara valores adjacentes e troca se estiverem fora de ordem
                if (ordemCrescente[j] > ordemCrescente[j + 1]) {
                    temporaria = ordemCrescente[j];
                    ordemCrescente[j] = ordemCrescente[j + 1];
                    ordemCrescente[j + 1] = temporaria;
                }
            }
        }

        // Exibe os números gerados aleatoriamente
        System.out.println("Números iniciais: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }

        // Exibe os números ordenados em ordem crescente
        System.out.println("\n\nNúmeros Ordenados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(ordemCrescente[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
