/* Exercicio07 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/31
 */
package Atividade08;

import java.util.Random;

public class Exercicio07 {
    public static void main(String[] args) {

        Random random = new Random(); // Cria um objeto da classe Random para gerar números aleatórios

        int[] numeros = new int[10]; // Cria um vetor de inteiros com 10 posições para armazenar os números aleatórios

        int[] ordemDecrescente = new int[numeros.length]; // Cria outro vetor com o mesmo tamanho para armazenar os números em ordem decrescente

        int temporaria; // Variável temporária usada na troca de valores durante a ordenação

        // Preenche o vetor 'numeros' com valores aleatórios entre 0 e 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        // Copia os valores do vetor 'numeros' para o vetor 'ordemDecrescente'
        for (int i = 0; i < numeros.length; i++) {
            ordemDecrescente[i] = numeros[i];
        }

        // Ordena os valores do vetor 'ordemDecrescente' usando o algoritmo Bubble Sort
        for (int i = 0; i < ordemDecrescente.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {

                // Compara valores adjacentes e troca se estiverem fora de ordem
                if (ordemDecrescente[j] < ordemDecrescente[j + 1]) {
                    temporaria = ordemDecrescente[j];
                    ordemDecrescente[j] = ordemDecrescente[j + 1];
                    ordemDecrescente[j + 1] = temporaria;
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

        // Exibe os números ordenados em ordem decrescente
        System.out.println("\n\nNúmeros Ordenados em ordem decrescente: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(ordemDecrescente[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
