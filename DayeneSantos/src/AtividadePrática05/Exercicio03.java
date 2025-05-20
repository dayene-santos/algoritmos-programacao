/* Exercicio03 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/07/04 
 */

package AtividadePrática5;

import java.util.Scanner;

public class Exercicio03 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, menor, meio, maior;
        
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        num3 = sc.nextInt();

        if (num1 < num2 && num1 < num3) {
            menor = num1;
            
            if (num2 < num3) {
                meio = num2;
                maior = num3;
                
            } else {
                meio = num3;
                maior = num2;
            }
            
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
            
            if (num1 < num3) {
                meio = num1;
                maior = num3;
                
            } else {
                meio = num3;
                maior = num1;
            }
            
        } else {
            menor = num3;
            
            if (num1 < num2) {
                meio = num1;
                maior = num2;
            } else {
                meio = num2;
                maior = num1;
            }
        }

        System.out.println("Números em ordem crescente: " + menor + ", " + meio + ", " + maior);

        sc.close();
    }
}

