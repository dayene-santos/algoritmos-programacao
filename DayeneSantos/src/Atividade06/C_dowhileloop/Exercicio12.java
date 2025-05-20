/* Exercicio12 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/10
 */
package Atividade06.C_dowhileloop;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String descricaoDoProduto = "";
        double precoUnitario = 0, totalDaCompra = 0;
        int quantidade = 0;

        do {
            System.out.print("Descrição do produto (ou FIM para encerrar): ");
            descricaoDoProduto = sc.nextLine();

            if (descricaoDoProduto.equalsIgnoreCase("FIM")) {
                break; // Encerra o loop se for FIM
            }

            System.out.print("Preço Unitário: ");
            precoUnitario = sc.nextDouble();
            sc.nextLine(); // Consumir a quebra de linha

            System.out.print("Quantidade de produtos: ");
            quantidade = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha

            totalDaCompra += precoUnitario * quantidade;

        } while (true);

        System.out.printf("Total da compra: R$ %.2f\n", totalDaCompra);

        sc.close();
    }
}
