/* Exercicio05 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/06
 */
package Atividade06.A_forloop;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num=0, soma=0,media=0;
        double dobro;

        // variável para receber a quantidade de números que serão calculados
        System.out.print("Quantos números serão digitados? ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.printf("Digite o %dº número: ", i+1);
            num = sc.nextDouble();
            soma+= num;
        }
        // calcula a média dos números inseridos
        media = soma/n;
        // calcula o dobro dos números inseridos
        dobro = soma + soma;

        // imprime os valores da soma, média e dobro dos valores inseridos
        System.out.printf("A soma dos números inseridos é: %.1f ", soma);
        System.out.printf("\nA média dos números inseridos é: %.1f ", media);
        System.out.printf("\nO dobro dos números inseridos é: %.1f ", dobro);

        sc.close();
    }
}
