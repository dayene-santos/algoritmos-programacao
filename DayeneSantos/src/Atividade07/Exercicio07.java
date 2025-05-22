/* Exercicio07 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/21
 */

import java.util.Random;

public class Exercicio07 {
    public static void main(String[] args) {

        Random random = new Random(); // objeto para gerar letras aleatórias
        char[] letras = new char[6]; // vetor que vai armazenar as letras geradas

        // Preenchendo o vetor com letras aleatórias de A a Z
        for(int i = 0; i < letras.length; i++) {
            /*'A' tem valor 65 na tabela ASCII.
             * random.nextInt(26) gera um número entre 0 e 25.
             *Somando os dois, temos um valor entre 65 (A) e 90 (Z).
             *(char) converte esse número de volta pra uma letra.
             */
            letras[i] = (char) ('A' + random.nextInt(26));
        }

        // Exibindo o vetor
        System.out.print("Letras aleatórias geradas: ");
        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i]);
            if (i < letras.length - 1) {
                System.out.print(", "); // última letra sem vírgula
            }
        }
    }
}
