/* Exercicio02 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/20
 */

public class Exercicio02 {
    public static void main(String[] args) {

        // Declaração e inicialização de um array de números do tipo double com 10 elementos
        double[] numero = new double[]{0.12, -0.45, 0.03, -0.78, 0.56, -0.09,
                0.012, -0.33, 0.07, -0.055};

        // Imprime a frase "Ordem Direta: " antes de mostrar os números na ordem original
        System.out.print("Ordem Direta: ");

        // Loop para percorrer o array do início (índice 0) até o final (índice numero.length - 1)
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i]); // Imprime o elemento atual do array seguido de " / "
            if (i < numero.length - 1) {
                System.out.print(", "); // vírgula só entre os números, não no final
            }
        }

        // Imprime uma quebra de linha e a frase "Ordem Indireta: " antes de mostrar os números em ordem invertida
        System.out.print("\nOrdem Indireta: ");

        // Loop para percorrer o array do final (índice numero.length - 1) até o início (índice 0)
        for (int i = numero.length - 1; i >= 0; i--) {
            System.out.print(numero[i]); // Imprime o elemento atual do array na ordem inversa
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
