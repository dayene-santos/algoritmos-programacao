/* Exercicio03 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/06/11
 */
package Atividade09;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char LIVRE = 'L'; // Constante para representar um assento Livre
        char OCUPADO = 'O'; // Constante para representar um assento Ocupado

        // Vetores que representam disponibilidade, número de salas, fileiras e assentos
        char[] disponibilidade = new char[]{'L', 'O'};
        int[] sala = new int[]{1, 2, 3};
        int[] fileira = new int[]{1, 2, 3, 4, 5};
        int[] assento = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // matriz tridimensional que representa o cinema [sala][fileira][assento]
        char[][][] cinema = new char[sala.length][fileira.length][assento.length];

        // laço que inicializa todos os assentos como livres
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < fileira.length; j++) {
                for (int k = 0; k < assento.length; k++) {
                    cinema[i][j][k] = LIVRE; // Marca todos os assentos como livres
                }
            }
        }

        // Exibição visual
        System.out.println("-------- CINEMA NEWTON PAIVA --------");
        for (int i = 0; i < sala.length; i++) {
            System.out.println("\n            Sala " + sala[i]);
            System.out.println("------------------------------------");
            for (int j = 0; j < fileira.length; j++) {
                System.out.printf("Fileira %d: ", fileira[j]);
                for (int k = 0; k < assento.length; k++) {
                    System.out.print(cinema[i][j][k] + " "); // Mostra o status de cada assento
                }
                System.out.println(); // quebra de linha após cada fileira
            }
            System.out.println(); // espaço entre as salas
        }

        char continuar;
        do {
            // coleta os dados do usuário sobre o assento desejado
            System.out.println("\nEscolha seu assento:");

            System.out.print("Sala (1 a 3): ");
            int salaEscolhida = sc.nextInt()-1; // Subtrai 1 para ajustar no indice do vetor

            System.out.print("Fileira (1 a 5): ");
            int fileiraEscolhida = sc.nextInt()-1; // subtrai 1 para ajustar no indice do vetor

            System.out.print("Assento (1 a 10): ");
            int assentoEscolhido = sc.nextInt()-1; // subtrai 1 para ajustar no indice do vetor

            // verifica o status do assento
            if (cinema[salaEscolhida][fileiraEscolhida][assentoEscolhido] == 'L') {
                cinema[salaEscolhida][fileiraEscolhida][assentoEscolhido] = 'O'; // Reserva o assento
                System.out.println("Assento reservado com sucesso!");
            } else {
                System.out.println("Esse assento já está ocupado!"); // Informa que não é possível reservar
            }

            // Pergunta se o usuário deseja selecionar outro assento
            System.out.print("Deseja escolher outro assento? (s/n): ");
            continuar = sc.next().toLowerCase().charAt(0); // converte a entrada para minúscula

        } while (continuar == 's'); // repete enquanto o usuário digitar 's'

        // Exibição final com os assentos atualizados
        System.out.println("\n-------- CINEMA NEWTON PAIVA --------");
        for (int i = 0; i < sala.length; i++) {
            System.out.println("\n            Sala " + sala[i]);
            System.out.println("------------------------------------");
            for (int j = 0; j < fileira.length; j++) {
                System.out.printf("Fileira %d: ", fileira[j]);
                for (int k = 0; k < assento.length; k++) {
                    System.out.print(cinema[i][j][k] + " "); //Mostra o status atualizado
                }
                System.out.println(); // quebra de linha após cada fileira
            }
            System.out.println(); // espaço entre as salas
        }
    }
}
