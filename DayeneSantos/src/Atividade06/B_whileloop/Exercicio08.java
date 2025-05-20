/* Exercicio08 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/10
 */
package Atividade06.B_whileloop;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome1="", nome2="", nome3="";
        String primeiroLugar="", segundoLugar="", terceiroLugar="";
        int qtdeOuro=0, qtdePrata=0, qtdeBronze=0;
        int pontuacao=0, pontuacao1=0, pontuacao2=0, pontuacao3=0;

        int i=0;
        while(i < 3) {
            System.out.print("Digite o nome do " + (i + 1) + "º País: ");
            // armazena o nome conforme iteração
            if (i == 0) nome1 = sc.nextLine();
            else if (i == 1) nome2 = sc.nextLine();
            else nome3 = sc.nextLine();
            // recebe a quantidade de medalhas
            System.out.print("Quantas medalhas de Ouro foram ganhas? ");
            qtdeOuro = sc.nextInt();
            System.out.print("Quantas medalhas de Prata foram ganhas? ");
            qtdePrata = sc.nextInt();
            System.out.print("Quantas medalhas de Bronze foram ganhas? ");
            qtdeBronze = sc.nextInt();
            sc.nextLine();
            // calculo de pontuação (Ouro peso 3, Prata peso 2, Bronze peso 1)
            pontuacao = (qtdeOuro * 3) + (qtdePrata * 2) + (qtdeBronze * 1);

            //armazena a pontuação em uma variável específica de acordo com a iteração
            if (i == 0) pontuacao1 = pontuacao;
            else if (i == 1) pontuacao2 = pontuacao;
            else pontuacao3 = pontuacao;

            i++;
                // laço para definir a classificação
            if (pontuacao1 >= pontuacao2 && pontuacao1 >= pontuacao3) {
                primeiroLugar = nome1;
                if (pontuacao2 >= pontuacao3) {
                    segundoLugar = nome2;
                    terceiroLugar = nome3;
                } else {
                    segundoLugar = nome3;
                    terceiroLugar = nome2;
                }
            } else if (pontuacao2 >= pontuacao1 && pontuacao2 >= pontuacao3) {
                primeiroLugar = nome2;
                if (pontuacao1 >= pontuacao3) {
                    segundoLugar = nome1;
                    terceiroLugar = nome3;
                } else {
                    segundoLugar = nome3;
                    terceiroLugar = nome1;
                }
            } else {
                primeiroLugar = nome3;
                if (pontuacao1 >= pontuacao2) {
                    segundoLugar = nome1;
                    terceiroLugar = nome2;
                } else {
                    segundoLugar = nome2;
                    terceiroLugar = nome1;
                }
            }
        }
            // exibe a classificação final
        System.out.println("\nClassificação Olímpica:");
        System.out.println("1º lugar: " + primeiroLugar);
        System.out.println("2º lugar: " + segundoLugar);
        System.out.println("3º lugar: " + terceiroLugar);

        sc.close();
    }
}
