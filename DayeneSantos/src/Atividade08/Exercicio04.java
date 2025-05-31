/* Exercicio04 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/30
 */
package Atividade08;

public class Exercicio04 {
    public static void main(String[] args) {

        double[] vetor1 = new double[]{
                2.0, 4.5, 3.0, 1.0, 6.5, 7.2, 5.1, 9.3, 8.0, 10.0,
                1.5, 2.3, 3.6, 4.7, 6.1, 7.4, 5.9, 8.2, 9.5, 2.8
        };
        double[] vetor2 = new double[]{
                1.0, 2.0, 0.5, 4.0, 5.0, 2.5, 3.0, 1.2, 1.1, 0.9,
                1.3, 1.7, 2.2, 3.3, 4.4, 2.6, 1.9, 0.8, 2.1, 3.5
        };

        // Cria um vetor para armazenar o inverso de vetor2
        double[] vetorInvertido = new double[vetor1.length];

        // Cria um vetor para armazenar o resultado final, com os produtos em ordem alternada
        double[] vetorResultado = new double[vetor1.length];

        // Cria um vetor intermediário para armazenar os produtos de cada posição
        double[] produtoTemporario = new double[vetor1.length];

        // Inverte os valores de vetor2 e armazena no vetorInvertido
        for (int i = 0; i < vetor1.length; i++) {
            vetorInvertido[i] = vetor2[vetor1.length - 1 - i];
        }

        // Calcula os índices iniciais do centro do vetorResultado
        // Se o vetor tem tamanho par, o centro tem dois índices: um à esquerda e um à direita
        int indiceCentroDireito = (vetor1.length / 2);     // ex: 20/2 = 10
        int indiceCentroEsquerdo = (vetor1.length / 2) - 1; // ex: 10 - 1 = 9

        /* Calcula o produto de vetor1 com o inverso de vetor2
         * E armazena os valores de forma alternada do centro para as bordas:
         * Índices pares vão da esquerda do centro para a esquerda do vetor
         * Índices ímpares vão da direita do centro para a direita do vetor
        */
        for (int i = 0; i < vetor1.length; i++) {
            produtoTemporario[i] = vetor1[i] * vetorInvertido[i];

            if (i % 2 == 0) {
                vetorResultado[indiceCentroEsquerdo--] = produtoTemporario[i];
            } else {
                vetorResultado[indiceCentroDireito++] = produtoTemporario[i];
            }
        }

        // Exibe o vetor1
        System.out.println("O primeiro vetor é: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i]);
            if (i < vetor1.length - 1) {
                System.out.print(", ");
            }
        }

        // Exibe o vetor2
        System.out.println("\n\nO segundo vetor é: ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i]);
            if (i < vetor2.length - 1) {
                System.out.print(", ");
            }
        }

        // Exibe o resultado final: os produtos organizados de forma alternada do centro para as bordas
        System.out.println("\n\nO produto do primeiro vetor pelo inverso do segundo armazenado a partir do centro para as bordas; de modo alternado é: ");
        for (int i = 0; i < vetorResultado.length; i++) {
            System.out.printf("%.2f", vetorResultado[i]);
            if (i < vetorResultado.length - 1) {
                System.out.print(" | ");
            }
        }
    }
}