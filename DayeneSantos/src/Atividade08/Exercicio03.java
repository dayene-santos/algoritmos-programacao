/* Exercicio03 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/27
 */
package Atividade08;

public class Exercicio03 {
    public static void main(String[] args) {

        double[] vetor1 = new double[]{
                2.0, 4.5, 3.0, 1.0, 6.5, 7.2, 5.1, 9.3, 8.0, 10.0,
                1.5, 2.3, 3.6, 4.7, 6.1, 7.4, 5.9, 8.2, 9.5, 2.8
        };
        double[] vetor2 = new double[]{
                1.0, 2.0, 0.5, 4.0, 5.0, 2.5, 3.0, 1.2, 1.1, 0.9,
                1.3, 1.7, 2.2, 3.3, 4.4, 2.6, 1.9, 0.8, 2.1, 3.5
        };
        double[] vetorInvertido = new double[vetor1.length]; // vetor para armazenar os valores invertidos
        double[] vetorResultado = new double[vetor1.length]; // vetor que armazenará o resultado final
        double[] produtoTemporario = new double[vetor1.length]; //vetor para calcular o produto

        //loop que irá percorrer o vetor2 e armazená-lo em ordem inversa
        for (int i = 0; i < vetor1.length; i++) {
            vetorInvertido[i] = vetor2[vetor1.length - 1 - i];
        }

        int indiceCentroDireito = (vetor1.length / 2); // calcula o centro a direita do vetor
        int indiceCentroEsquerdo = (vetor1.length / 2) - 1; // calcula o centro a esquerda do vetor

        //loop para calcular o produto do vetor1 pelo inverso do vetor2
        for (int i = 0; i < vetor1.length; i++) {
            produtoTemporario[i] = vetor1[i] * vetorInvertido[i];

            if (i % 2 == 0) {
                vetorResultado[indiceCentroEsquerdo--] = produtoTemporario[i];
            } else {
                vetorResultado[indiceCentroDireito++] = produtoTemporario[i];
            }
        }

        System.out.println("O primeiro vetor é: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i]);
            if (i < vetor1.length -1) {
                System.out.print(", ");
            }
        }

        System.out.println("\n\nO segundo vetor é: ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i]);
            if (i < vetor2.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n\nO produto do primeiro vetor pelo inverso do segundo armazenado a partir do centro para as bordas; de modo alternado é: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.printf("%.2f", vetorResultado[i]);
            if (i < vetorResultado.length - 1) {
                System.out.print(" | ");
            }
        }
    }
}
