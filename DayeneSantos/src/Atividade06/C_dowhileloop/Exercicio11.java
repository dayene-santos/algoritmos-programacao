/* Exercicio11 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/10
 */
package Atividade06.C_dowhileloop;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vinhoTinto = 0, vinhoBranco = 0, vinhoRose = 0, totalVinhos = 0;
        double percentualVinhoTinto = 0, percentualVinhoBranco = 0, percentualVinhoRose = 0;
        char tipoDeVinho;

        //laço principal
        do {
            System.out.print("Digite o tipo de vinho: (T) Tinto, (B) Branco, (R) Rosê ou (F) para finalizar.");
            tipoDeVinho = sc.next().toUpperCase().charAt(0); // captura a primeira letra digitada e converte minúsculas em maiúsculas

            // Verifica o tipo de vinho informado pelo usuário:
            // A cada identificação válida, incrementa a contagem correspondente.
            if (tipoDeVinho == 'T') { // 'T' para Tinto,
                vinhoTinto++;
            } else if (tipoDeVinho == 'B') { // 'B' para Branco
                vinhoBranco++;
            } else if (tipoDeVinho == 'R') { // 'R' para Rosê
                vinhoRose++;
            } else if (tipoDeVinho != 'F') { // Se for uma letra diferente de T, B, R ou F, será ignorada.
                System.out.println("Tipo Inválido. Digite T, B, R ou F."); // alerta para o caso de um número que não esteja dentro dos códigos válidos (T, B, R, F)
            }

        } while (tipoDeVinho != 'F'); // condição que determina a finalização do loop

        totalVinhos = vinhoTinto + vinhoBranco + vinhoRose; // calculo do total de vinhos

        // calculo dos percentuais
        if (totalVinhos > 0) {
            percentualVinhoTinto = ((double) vinhoTinto / totalVinhos) * 100;
            percentualVinhoBranco = ((double) vinhoBranco / totalVinhos) * 100;
            percentualVinhoRose = ((double) vinhoRose / totalVinhos) * 100;
        }

        // exibição dos resultados
        System.out.println("\n--- Levantamento Final do Estoque ---");
        System.out.printf("Vinho Tinto:  %d unidades (%.2f%%)\n", vinhoTinto, percentualVinhoTinto);
        System.out.printf("Vinho Branco: %d unidades (%.2f%%)\n", vinhoBranco, percentualVinhoBranco);
        System.out.printf("Vinho Rosê:   %d unidades (%.2f%%)\n", vinhoRose, percentualVinhoRose);
        System.out.println("Total de vinhos cadastrados: " + totalVinhos);

        sc.close();
    }
}
