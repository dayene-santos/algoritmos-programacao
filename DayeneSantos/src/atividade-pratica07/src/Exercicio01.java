/* Exercicio01 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/20
 */
public class Exercicio01 {
    public static void main(String[] args) {

        int[] numero = new int[]{1,2,3,4,5,6,7,8,9};

        System.out.print("Ordem Direta: ");
        for(int i = 0; i< numero.length; i++){
            System.out.print(numero[i] + " - ");
        }
        System.out.print("\nOrdem Indireta: ");
        for(int i = numero.length -1; i >= 0; i--){
            System.out.print(numero[i] + " - ");
        }
    }
}
