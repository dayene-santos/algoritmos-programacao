/* Exercicio09 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/31
 */
package Atividade08;

import java.util.Random;

public class Exercicio09 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[] numeros = new int[15];
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = aleatorio.nextInt(21)-10; // gera números entre -10 e 10
        }

        // Imprime os números gerados aleatóriamente
        System.out.println("Os números gerados entre -10 e 10 foram: ");
        for (int i = 0; i < numeros.length; i ++) {
            System.out.print(numeros[i]);
            if(i< numeros.length){
                System.out.print(", ");
            }
        }
    }
}
