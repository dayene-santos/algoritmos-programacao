/* Exercicio04 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/20
 */

public class Exercicio04 {
    public static void main(String[] args) {

        double soma=0, media=0;
        double[] num = new double[]{2.5, 5.3, 0.8, 6.7, 9.1, 5.0, 7.3, 0.5};

        for(int i = 0; i < num.length; i++){
            soma += num[i];
        }
        media = soma/ num.length;

        System.out.print("Valores do vetor: ");
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i < num.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.printf("\nA soma dos valores do vetor é: %.2f ", soma);
        System.out.printf("\nA média dos valores do vetor é: %.2f ",  media);
    }
}
