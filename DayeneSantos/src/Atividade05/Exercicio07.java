/* Exercicio07 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/04/07 
 */

package AtividadePrática5;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int numero;
        boolean primo = true;
        
        System.out.print("Digite um número: ");
        numero = sc.nextInt();
        
        if (numero <= 1) {
            primo = false;

        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        sc.close();
    }
}
