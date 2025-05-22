/* Exercicio03 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/20
 */

public class Exercicio03 {
    public static void main(String[] args) {

        // Declaração e inicialização da variável que armazenará a soma dos elementos
        int soma = 0;

        // Declaração e inicialização de um array de inteiros com 6 elementos fixos
        int[] numeros = new int[]{2, 5, 12, 15, 18, 30};

        // Percorre o array do início ao fim somando os valores à variável 'soma'
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        // Exibe o resultado da soma
        System.out.println("A soma dos valores do vetor é: " + soma);
    }
}
