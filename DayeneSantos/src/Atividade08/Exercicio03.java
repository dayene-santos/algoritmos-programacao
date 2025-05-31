/* Exercicio03 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/27
 */
package Atividade08;

public class Exercicio03 {
    public static void main(String[] args) {

        // Declara e inicializa vetor1 com 20 números decimais (double)
        double[] vetor1 = new double[]{
                2.0, 4.5, 3.0, 1.0, 6.5, 7.2, 5.1, 9.3, 8.0, 10.0,
                1.5, 2.3, 3.6, 4.7, 6.1, 7.4, 5.9, 8.2, 9.5, 2.8
        };

        // Declara e inicializa vetor2 com 20 outros números decimais
        double[] vetor2 = new double[]{
                1.0, 2.0, 0.5, 4.0, 5.0, 2.5, 3.0, 1.2, 1.1, 0.9,
                1.3, 1.7, 2.2, 3.3, 4.4, 2.6, 1.9, 0.8, 2.1, 3.5
        };
        double[] vetorInvertido = new double[vetor1.length]; // vetor para armazenar os valores invertidos
        double[] vetorResultado = new double[vetor1.length]; // vetor que armazenará o resultado final
        double[] produtoTemporario = new double[vetor1.length]; //vetor para calcular o produto

        // Inverte vetor2 e salva em vetorInvertido
        for (int i = 0; i < vetor1.length; i++) {
            vetorInvertido[i] = vetor2[vetor1.length - 1 - i];
        }

        int direita = vetorResultado.length -1; // posição da direita para preencher
        int esquerda = 0;  // posição da esquerda para preencher

        /* Calcula o produto dos elementos correspondentes de vetor1 e vetorInvertido
         * Em seguida, armazena o resultado de forma alternada:
         * - se o índice for par, coloca da esquerda para o centro
         * - se o índice for ímpar, coloca da direita para o centro
        */
         for (int i = 0; i < vetor1.length; i++) {
            produtoTemporario[i] = vetor1[i] * vetorInvertido[i];

            if (i % 2 == 0) {
                vetorResultado[esquerda++] = produtoTemporario[i];
            } else {
                vetorResultado[direita--] = produtoTemporario[i];
            }
        }

         // Exibe o vetor1 formatado
        System.out.println("O primeiro vetor é: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i]);
            if (i < vetor1.length -1) {
                System.out.print(", ");
            }
        }

        // Exibe o vetor2 formatado
        System.out.println("\n\nO segundo vetor é: ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i]);
            if (i < vetor2.length -1) {
                System.out.print(", ");
            }
        }

        // Exibe o resultado final formatado, com separador " | " entre os valores
        System.out.println("\n\nO produto do primeiro vetor pelo inverso do segundo armazenado a partir das bordas para o centro; de modo alternado é: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.printf("%.2f", vetorResultado[i]);
            if (i < vetorResultado.length - 1) {
                System.out.print(" | ");
            }
        }
    }
}
