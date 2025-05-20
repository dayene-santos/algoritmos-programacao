/* Exercicio06 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/07
 */
package Atividade06.B_whileloop;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // variáveis para armazenar contagem total e por categoria (nulo, branco, candidatos)
        int votos, totalVotos = 0, nulo = 0, branco = 0;
        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;
        double percentualCandidato1 = 0, percentualCandidato2 = 0, percentualCandidato3 = 0, percentualCandidato4 = 0, percentualNulo = 0, percentualBranco = 0;

        // Mensagem inicial
        System.out.println("Informe o código do voto (1-4=Candidatos, 5=Nulo, 6=Branco, 0=Encerrar)");
        votos = sc.nextInt();

        // código 0 encerra o programa
        while (votos != 0) {
            if (votos >= 1 && votos <= 6) { // verifica se o número digitado está dentro dos códigos válidos (1 a 6)
                totalVotos += 1; // conta o total de votos recebidos
                // incrementa a contagem para o candidato ou tipo de voto correspondente
                switch (votos) {
                    case 1:
                        candidato1 += 1;
                        break;
                    case 2:
                        candidato2 += 1;
                        break;
                    case 3:
                        candidato3 += 1;
                        break;
                    case 4:
                        candidato4 += 1;
                        break;
                    case 5:
                        nulo += 1;
                        break;
                    case 6:
                        branco += 1;
                        break;
                }
            } else { // alerta para o caso de um número que não esteja dentro dos códigos válidos (0 a 6)
                System.out.println("Código Inválido! Digite um número entre 1 e 6");
            } // mensagem para dar sequência ao código
            System.out.println("Informe o código do voto (1-4=Candidatos, 5=Nulo, 6=Branco, 0=Encerrar)");
            votos = sc.nextInt();
        }
        // calculo da porcentagem de votos
        if (totalVotos > 0) {
            percentualCandidato1 = ((double) candidato1 / totalVotos) * 100;
            percentualCandidato2 = ((double) candidato2 / totalVotos) * 100;
            percentualCandidato3 = ((double) candidato3 / totalVotos) * 100;
            percentualCandidato4 = ((double) candidato4 / totalVotos) * 100;
            percentualNulo = ((double) nulo / totalVotos) * 100;
            percentualBranco = ((double) branco / totalVotos) * 100;
        }
        // imprime o total de votos e os percentuais calculados
        System.out.printf("Total de votos Candidato 1: %d (%.2f%%)%n", candidato1, percentualCandidato1);
        System.out.printf("Total de votos Candidato 2: %d (%.2f%%)%n", candidato2, percentualCandidato2);
        System.out.printf("Total de votos Candidato 3: %d (%.2f%%)%n", candidato3, percentualCandidato3);
        System.out.printf("Total de votos Candidato 4: %d (%.2f%%)%n", candidato4, percentualCandidato4);
        System.out.printf("Total de votos Nulos: %d (%.2f%%)%n", nulo, percentualNulo);
        System.out.printf("Total de votos em Branco: %d (%.2f%%)%n", branco, percentualBranco);

        sc.close();
    }
}