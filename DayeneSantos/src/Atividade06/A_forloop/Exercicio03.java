/* Exercicio03 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/06
 */
package Atividade06.A_forloop;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        double numero;
        double positivos=0, qtdePositivos=0, mediaPositivos=0;
        double negativos=0, qtdeNegativos=0, mediaNegativos=0;

        System.out.println("Quantos números você irá inserir?");
        n = sc.nextInt();

        for(int i=0; i <n; i++) {
            System.out.println("Digite número: ");
            numero = sc.nextDouble();
            //verifica se o número inserido é igual a 0
            if (numero == 0) {
                System.out.println("O número precisa ser diferente de zero.");
                i--; // decremento para manter o laço de repetição com a quantidade de valores corretos
                continue; // volta para o inicio do laço para seguir a ordem correta
            }
            if (numero >0) {
                qtdePositivos++;
                positivos += numero;
            } else {
                qtdeNegativos++;
                negativos += numero;
            }
            mediaPositivos = positivos/qtdePositivos;
            mediaNegativos = negativos/qtdeNegativos;

        }
        System.out.println("A média de números positivos é: " + mediaPositivos);
        System.out.println("A média de números negativos é: " + mediaNegativos);

        sc.close();
    }
}
