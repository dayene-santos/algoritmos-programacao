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
        double[] vetor2 = new double[] {
                1.0, 2.0, 0.5, 4.0, 5.0, 2.5, 3.0, 1.2, 1.1, 0.9,
                1.3, 1.7, 2.2, 3.3, 4.4, 2.6, 1.9, 0.8, 2.1, 3.5
                };

                // Vetor que armazenará os resultados organizados a partir do centro
                double[] resultadoFinal = new double[20];

                // Índice que percorre os elementos de vetor1 e vetor2
                int leitura = 0;

                // Índices para preencher o resultado do centro para as bordas
                int escreveEsquerda = 9; // Começa na posição central esquerda
                int escreveDireita = 10; // Começa na posição central direita

                // Laço para processar os 20 elementos
                while (leitura < 20) {
                    // Primeiro preenche o lado esquerdo
                    resultadoFinal[escreveEsquerda] = vetor1[leitura] * (1.0 / vetor2[leitura]);
                    escreveEsquerda--; // Anda para o lado mais à esquerda
                    leitura++;         // Avança a leitura

                    // Se ainda tiver elementos, preenche o lado direito
                    if (leitura < 20) {
                        resultadoFinal[escreveDireita] = vetor1[leitura] * (1.0 / vetor2[leitura]);
                        escreveDireita++; // Anda para o lado mais à direita
                        leitura++;        // Avança a leitura
                    }
                }

                // Impressão do vetor final para conferência
                System.out.println("Resultado final (do centro para as bordas):");
                for (int i = 0; i < resultadoFinal.length; i++) {
                    System.out.printf("Posição %2d: %.2f%n", i, resultadoFinal[i]);
                }
        }
}