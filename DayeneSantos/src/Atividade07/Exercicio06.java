/* Exercicio06 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/20
 */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tentativa = 0;
        boolean encontrou = false; // controla o laço

        // Vetor fixo de 15 números
        int[] numeros = new int[]{12, -3, 7, 0, 18, 25, -8, 4, 33, 10, -15, 6, 21, -2, 14};

        // Laço que repete até o usuário inserir um número que esteja no vetor
        while (!encontrou) {
            System.out.print("Digite um número inteiro: "); // informa ao usuário o que deve fazer
            tentativa = sc.nextInt(); // recebe o número digitado

            // verifica se o número está no vetor
            for (int i = 0; i < numeros.length; i++) {
                if (tentativa == numeros[i]) {
                    System.out.printf("Parabéns! O número %s faz parte do vetor!", tentativa); // Informa e parabeniza pelo acerto
                    System.out.println("\nEle se encontra na posição: " + i); // informa a posição do número no vetor
                    encontrou = true; // sai do laço while
                    break; // para o laço for
                }
            }
            // se não encontrar, avisa o usuário
            if (!encontrou) {
                System.out.printf("Infelizmente o número %s não faz parte do vetor. Tente novamente.\n", tentativa);

            }
        }
        //Mostra o vetor apenas depois de o usuário acertar
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", "); // último número sem vírgula
            }
        }
            sc.close(); // encerra o scanner (boas práticas)
    }
}
