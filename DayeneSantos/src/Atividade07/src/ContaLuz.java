/* ContaLuz application
 *
 * Questão Bônus
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/21
 */
import java.util.Random;
import java.util.Scanner;

public class ContaLuz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vetor com os nomes dos meses
        String[] mes = new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                                    "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        // Vetores para armazenar os dados
        String nomeCliente;
        int idCliente;
        double[] consumoKWh = new double[12];
        double[] valorConta = new double[12];

        // Leitura dos dados do cliente
        System.out.print("Digite o ID do cliente: ");
        idCliente = sc.nextInt();
        sc.nextLine(); // limpa o buffer

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = sc.nextLine();

        // Leitura dos dados de consumo e valor
        for(int i = 0; i < 12; i++) {
            System.out.print("Quantidade de kWv consumida - ");
            System.out.print(mes[i] + ": ");
            consumoKWh[i] = sc.nextDouble();

            System.out.print("Valor pago na conta de luz: ");
            valorConta[i] = consumoKWh[i] * 0.75;
            System.out.printf("R$ %.2f\n", valorConta[i]);
        }

        //calcular o valor médio pago por mês
        double somaValores = 0;
        for(double valor : valorConta) {
            somaValores += valor;
        }

        double mediaMensal = somaValores/12;

        //identificar o mês de maior consumo de kWh
        int indiceMaiorConsumo=0;
        for (int i = 1; i < 12; i++) {
            if (consumoKWh[i] > consumoKWh[indiceMaiorConsumo]) {
                indiceMaiorConsumo = i;
            }
        }

        // Identificar o mês com conta mais cara
        int indiceContaMaisCara = 0;
        for (int i = 1; i < 12; i++) {
            if (valorConta[i] > valorConta[indiceContaMaisCara]) {
                indiceContaMaisCara = i;
            }
        }

               // Exibir resultados
        System.out.println("\n==== RESUMO ====");
        System.out.println("Cliente: " + nomeCliente + " | ID: " + idCliente);
        System.out.printf("Valor médio mensal: R$ %.2f\n", mediaMensal);
        System.out.println("Mês com maior consumo: " + mes[indiceMaiorConsumo] +
                " ( " + consumoKWh[indiceMaiorConsumo] + " kWh = R$ " + valorConta[indiceContaMaisCara] + " )");
        System.out.println("-------------------------------------------");

        sc.close(); // Boas práticas: fecha o Scanner
    }
}
