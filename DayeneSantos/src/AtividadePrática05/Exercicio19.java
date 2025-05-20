/* Exercicio19 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/04/07 
 */

package AtividadePrática5;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        double litros, precoLitro = 0, descontoPorcentagem = 0, valorBruto, valorDesconto, valorFinal;
        char tipo;

        System.out.print("Digite o número de litros vendidos: ");
        litros = sc.nextDouble();

        System.out.print("Digite o tipo de combustível (A para álcool, G para gasolina): ");
        tipo = sc.next().toUpperCase().charAt(0);

        if (tipo == 'A') {
            precoLitro = 4.60;

            if (litros <= 20) {
                descontoPorcentagem = 3;
            } else {
                descontoPorcentagem = 5;
            }

        } else if (tipo == 'G') {
            precoLitro = 6.40;

            if (litros <= 20) {
                descontoPorcentagem = 4;
            } else {
                descontoPorcentagem = 6;
            }

        } else {
            System.out.println("Tipo de combustível inválido. Use 'A' para álcool ou 'G' para gasolina.");
            sc.close();
            return;
        }

        valorBruto = litros * precoLitro;
        valorDesconto = valorBruto * (descontoPorcentagem / 100);
        valorFinal = valorBruto - valorDesconto;

        System.out.printf("Valor bruto: R$ %.2f\n", valorBruto);
        System.out.printf("Desconto de %.0f%%: R$ %.2f\n", descontoPorcentagem, valorDesconto);
        System.out.printf("Valor a pagar: R$ %.2f\n", valorFinal);

        sc.close();
    }
}

