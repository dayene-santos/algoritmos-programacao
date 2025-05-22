/* Exercicio09 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/21
 */
public class Exercicio09 {
    public static void main(String[] args) {

        // vetor que armazena as letras
        char[] letras = new char[]{'E','N','E','Y','A','D','S','M'}; // char é declarado com aspas simples ''

            /*
            * Inicia a variável i com o último índice do vetor.
            * Como o vetor começa em 0, o último índice é tamanho - 1.
            * Ex: se letras.length = 8, então i = 7.
            */
        for (int i = letras.length -1; i >= 0 ; i--) { //loop que exibe as letras na ordem inversa
            System.out.print(letras[i]);
        }
    }
}
