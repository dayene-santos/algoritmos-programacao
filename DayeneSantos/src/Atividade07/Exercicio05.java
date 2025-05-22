/* Exercicio05 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/20
 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares=0; // Variável para contar a quantidade de números pares digitados
        int[] num = new int[4]; // Vetor (array) que vai armazenar 4 números inteiros

        // Laço para ler os 4 números digitados pelo usuário
        for (int i=0; i< num.length; i++){
            System.out.print("Escreva o " + (i + 1) + "º número inteiro: "); // Solicita o número ao usuário
            num[i] = sc.nextInt();// Lê o número digitado e armazena na posição i do vetor
        if(num[i] % 2 == 0) { // Verifica se o número é par (resto da divisão por 2 é zero)
            pares++;  // Se for par, incrementa o contador de pares
            }
        }
        System.out.print("Os números digitados são: ");
        // Laço para imprimir todos os números armazenados no vetor
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "; "); // Imprime cada número seguido de um ponto e vírgula
        }

        System.out.println("\nA quantidade de números pares digitados foi: " + pares);  // Imprime o total de números pares
        System.out.print("E esses números são: ");

        // Laço para imprimir apenas os números pares do vetor
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) { // Verifica se o número é par
                System.out.print(num[i] + "; "); // Imprime o número par seguido de ponto e vírgula

            }
        }

        sc.close(); // Fecha o scanner (boas práticas)
    }
}
