/* Exercicio01 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/31 
 */

package AtividadePrática5;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nota1, nota2, nota3, media, nota_exame = 0;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        if (media < 3) {
            System.out.printf("Sua média final foi de %.2f, portanto, você está Reprovado!\n", media);
        } else if (media >= 3 && media < 6) {
            System.out.printf("Sua média final foi de %.2f, portanto, você terá que fazer um novo Exame!\n", media);
            // Cálculo da nota necessária no exame
            nota_exame = 12 - media;
            System.out.printf("A nota mínima necessária para sua aprovação é: %.2f\n", nota_exame);
        } else { 
            System.out.printf("Sua média final foi de %.2f\n", media);
            System.out.println("PARABÉNS, Você está Aprovado!");
        }
        sc.close();
    }
}
