/* Exercicio09 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/07
 */
package Atividade06.B_whileloop;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero=0, pares=0, qtdePares=0;
        double media=0;
        // recebe o primeiro número antes de entrar no while
        System.out.print("Digite um número: ");
        numero = sc.nextInt();
        // 0 encerra o programa
        while (numero != 0) {
            // verifica se o número é par
            if(numero != 0 && numero % 2 == 0){
                pares += numero; // soma os números pares
                qtdePares++; // incrementa a quantidade de pares
            }
            // verifica se a quantidade é diferente de zero para não haver erro de divisão
            if(qtdePares != 0) {
                media = (double) pares/qtdePares;
            } else {
                media = 0;
            }
            // lê o próximo número
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
        }

        System.out.println("A soma dos números pares inseridos é: " + pares);
        System.out.println("A quantidade de números pares inseridos é: " + qtdePares);
        System.out.println("A média aritmética dos números pares inseridos é: " + media);
        sc.close();
    }
}
