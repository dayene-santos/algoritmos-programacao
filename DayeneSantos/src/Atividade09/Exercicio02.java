/* Exercicio02 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/06/11
 */
package Atividade09;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um Scanner para ler dados do usuário

        // Declara dois arrays de String: um para os nomes dos clubes, outro para os campeonatos
        String[] clubes = new String[2];
        String[] campeonatos = new String[3];

        // Solicita ao usuário os nomes de dois clubes de futebol
        System.out.println("Escolha dois times brasileiros de futebol: ");
        for (int i = 0; i < clubes.length; i++) {
            System.out.print((i + 1) + "º Time: ");
            clubes[i] = sc.nextLine();
        }

        // Solicita ao usuário os nomes de três campeonatos de futebol
        System.out.println("Escolha três campeonatos de futebol: ");
        for (int i = 0; i < campeonatos.length; i++) {
            System.out.print((i + 1) + "º Campeonato: ");
            campeonatos[i] = sc.nextLine();
        }

        int[][] titulos = new int[2][3]; // Matriz para armazenar a quantidade de títulos de cada clube em cada campeonato
        int[][] transposto = new int[3][2]; // Matriz transposta, que inverterá as linhas e colunas da matriz "titulos"

        // Preenche a matriz "titulos" com os dados fornecidos pelo usuário
        for (int i = 0; i < clubes.length; i++) {
            for (int j = 0; j < campeonatos.length; j++) {
                System.out.print("Quantos títulos do " + campeonatos[j] + " o " + clubes[i] + " tem? ");
                titulos[i][j] = sc.nextInt(); // Lê a quantidade de títulos
            }
        }

        // Gera a matriz transposta, invertendo linhas por colunas
        for (int i = 0; i < campeonatos.length; i++) {
            for (int j = 0; j < clubes.length; j++) {
                transposto[i][j] = titulos[j][i];
            }
        }

        // Imprime a matriz original com os dados inseridos
        System.out.println("\n                 -          TABELA ORIGINAL          -");
        // Imprime a linha de cabeçalho com os campeonatos
        System.out.print("\n            "); // espaço para o canto esquerdo antes dos campeonatos
        for (int j = 0; j < campeonatos.length; j++) {
            System.out.printf("| %12s ", campeonatos[j]);
        }
        System.out.println("|");
        System.out.println("----------------------------------------------------------------------------");

        // Imprime cada linha com o nome do clube e os títulos
        for (int i = 0; i < clubes.length; i++) {
            System.out.printf("%-12s ", clubes[i]); // imprime o nome do clube alinhado à esquerda
            for (int j = 0; j < campeonatos.length; j++) {
                System.out.printf("| %12d ", titulos[i][j]); // imprime o título alinhado à direita
            }
            System.out.println("|");
            System.out.println("----------------------------------------------------------------------------");
        }

        System.out.println("\n            -          TABELA TRANSPOSTA          -");
        // Imprime a linha de cabeçalho com os clubes
        System.out.print("\n            ");
        for (int j = 0; j < clubes.length; j++) {
            System.out.printf("| %12s ", clubes[j]);
        }
        System.out.println("|");
        System.out.println("----------------------------------------------------------------------------");

        // Imprime cada linha com o nome do campeonato e os títulos
        for (int i = 0; i < campeonatos.length; i++) {
            System.out.printf("%-12s ", campeonatos[i]);
            for (int j = 0; j < clubes.length; j++) {
                System.out.printf("| %12d ", transposto[i][j]);
            }
            System.out.println("|");
            System.out.println("----------------------------------------------------------------------------");
        }

        sc.close();
    }
}