/* Exercicio05 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/27
 */
package Atividade08; // define o pacote onde a classe está localizada

import java.util.Random; // biblioteca que gera números aleatórios

public class Exercicio05 {
    public static void main(String[] args) {
        Random random = new Random(); // cria o objeto que irá gerar os números aleatórios

        int[] numeros = new int[20]; // vetor que irá armazenar 20 números
        int pares = 0; // variável que irá contar os números pares presentes no vetor

        // loop para gerar os números para o vetor
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;

            // verifica se o número é par
            if (numeros[i] % 2 == 0) {
                pares++; // incrementa de acordo com os números pares inseridos
            }
        }
        // imprime os números do vetor
        System.out.print("\nOs números do vetor são: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", "); // vírgula só entre os números, não no final
            }
        }
        // exibe a quantidade de números pares presentes no vetor
        System.out.println("\nDesses números, " + pares + " são pares.");
        System.out.println("Sendo eles: ");
        // exibe quais são os números pares
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