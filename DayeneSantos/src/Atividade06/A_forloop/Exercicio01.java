/* Exercicio01 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/05
 */
package Atividade06.A_forloop;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //iniciando as variáveis para não haver erro ao rodar o código
        int pares=0, qtdePares = 0, qtdeImpares = 0, impares = 0;

        for (int i = 1; i < 11; i++) {
            System.out.printf("Digite o %dº número: ", i); // ajuda a identificar o número que está sendo inserido
            int num = sc.nextInt(); // recebe os números

            //verifica se o número inserido é igual a 0
            if (num == 0) {
                System.out.println("O número precisa ser diferente de zero.");
                i--; // decremento para manter o laço de repetição com a quantidade de valores corretos
                continue; // volta para o inicio do laço para seguir a ordem correta
            }
            // verifica se o número é par
            if (num % 2 == 0) {
                qtdePares++; // conta a quantidade de números pares
                pares += num; // soma os valores pares que são inseridos
            } else {
                qtdeImpares++; // conta a quantidade de números ímpares
                impares += num; // soma os valores ímpares que são inseridos
            }
        }
        //Mostra quantos pares e ímpares foram digitados e suas somas
        System.out.println("Quantidade de números pares: " + qtdePares);
        System.out.println("Quantidade de números ímpares: " + qtdeImpares);
        System.out.println("A soma dos números pares é: " + pares);
        System.out.println("A soma dos números ímpares é: " + impares);
        sc.close();

    }
}
