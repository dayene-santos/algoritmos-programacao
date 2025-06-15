/* Exercicio04 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/06/13
 */
package Atividade09;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bairros = new String[]{"Cidade Nova", "Concórdia", "Palmares"};
        String[] diaDaSemana = new String[]{"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        // Criação da matriz 7x3 para armazenar temperaturas
        double[][] temperaturas = new double[diaDaSemana.length][bairros.length];

        // Entrada das temperaturas pelo usuário
        for (int i = 0; i < diaDaSemana.length; i++) {
            System.out.println("Temperaturas de " + diaDaSemana[i] + ": ");
            for (int j = 0; j < bairros.length; j++) {
                System.out.print("Bairro " + bairros[j] + ": ");
                temperaturas[i][j] = sc.nextDouble();
            }
        }

        // Impressão da tabela formatada com dias e bairros
        System.out.print("\n             "); // espaço para canto esquerdo
        for (int j = 0; j < bairros.length; j++) {
            System.out.printf("| %12s ", bairros[j]);
        }
        System.out.println("|");
        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < diaDaSemana.length; i++) {
            System.out.printf("%-12s ", diaDaSemana[i]);
            for (int j = 0; j < bairros.length; j++) {
                System.out.printf("| %12.1f ", temperaturas[i][j]);
            }
            System.out.println("|");
            System.out.println("----------------------------------------------------------------------------");
        }

        System.out.println();

        // Calcula e exibe a temperatura média da semana para cada bairro
        for (int j = 0; j < bairros.length; j++) {
            double soma = 0;
            for (int i = 0; i < diaDaSemana.length; i++) {
                soma += temperaturas[i][j];
            }
            double media = soma / diaDaSemana.length;
            System.out.printf("Média da semana para o bairro %s: %.2f °C%n", bairros[j], media);
        }

        System.out.println();

        // Encontra e exibe o dia com maior temperatura para cada bairro
        for (int j = 0; j < bairros.length; j++) {
            double maior = temperaturas[0][j];
            int indiceDiaMaior = 0;
            for (int i = 1; i < diaDaSemana.length; i++) {
                if (temperaturas[i][j] > maior) {
                    maior = temperaturas[i][j];
                    indiceDiaMaior = i;
                }
            }
            System.out.printf("No bairro %s, o dia com maior temperatura foi %s com %.2f °C.%n",
                    bairros[j], diaDaSemana[indiceDiaMaior], maior);
        }

        System.out.println();

        // Encontra e exibe a maior temperatura geral na matriz, com dia e bairro
        double maiorValorGeral = temperaturas[0][0];
        int indiceDiaMaiorGeral = 0;
        int indiceBairroMaiorGeral = 0;

        for (int i = 0; i < diaDaSemana.length; i++) {
            for (int j = 0; j < bairros.length; j++) {
                if (temperaturas[i][j] > maiorValorGeral) {
                    maiorValorGeral = temperaturas[i][j];
                    indiceDiaMaiorGeral = i;
                    indiceBairroMaiorGeral = j;
                }
            }
        }

        System.out.printf("A maior temperatura registrada na semana foi %.2f °C,  %s, no bairro %s.%n",
                maiorValorGeral,  diaDaSemana[indiceDiaMaiorGeral], bairros[indiceBairroMaiorGeral]);
    }
}