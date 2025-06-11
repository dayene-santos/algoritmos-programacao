/* Exercicio01 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/06/10
 */

package Atividade09;

import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        Random aleatorio = new Random(); // Cria um objeto da classe Random para gerar números aleatórios.

        int[][] matriz = new int[3][3]; // Declara e inicializa uma matriz bidimensional 3x3 de inteiros.

        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < matriz.length; j++ ){
                matriz[i][j] = aleatorio.nextInt(50)+1;
                // Preenche cada posição da matriz com um número aleatório de 1 a 50.
            }
        }

        System.out.println("----------------"); // linha superior

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("| %2d ", matriz[i][j]); // cada célula da linha
            }
            System.out.println("|"); // fecha a linha
            System.out.println("----------------"); // linha separadora
        }
    }
}