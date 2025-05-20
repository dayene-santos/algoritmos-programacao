/* Exercicio10 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/07
 */
package Atividade06.B_whileloop;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, chute, qtdeChute=0;
        // entrada para escolher o número a ser descoberto
        System.out.print("Escolha o número secreto: ");
        numero  = sc.nextInt();
        // entrada que recebe as tentativas
        System.out.print("Chute: ");
        chute = sc.nextInt();

        // laço para verificar as tentativas
        while(chute != numero){
            if(chute > numero){
                System.out.println("Alto");
            } else {
                System.out.println("Baixo");
            }
            // variavel que conta a quantidade de tentativas
            qtdeChute++;
            System.out.print("Chute: ");
            chute = sc.nextInt();
        }
        // exibe uma mensagem e a quantidade de tentativas
        System.out.println("Parabéns você acertou!");
        System.out.println("Seu número de tentativas foi: " +qtdeChute);

        sc.close();
    }
}
