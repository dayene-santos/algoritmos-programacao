/* Exercicio11 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/21
 */

public class Exercicio11 {
    public static void main(String[] args) {

        // variavel que irá armazenar a frase completa
        String frase = "";

        // vetor de 4 valores para armazenar palavras
        String[] palavras = new String[]{"Java", "codar", "sem", "drama"};

        // une as palavras em uma única variável
        for (int i = 0; i < palavras.length; i++) {
            if (i == 0) {
                frase += palavras[i] + ": ";
            } else {
                frase += palavras[i] + " ";
            }
        }
        // exibe a frase formada
        System.out.println(frase);
    }
}