/* Exercicio14 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/11
 */
package Atividade06.C_dowhileloop;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double nota1, nota2, nota3, media, somaMedias = 0;
        int qtdeAlunos = 0, qtdeAprovados = 0, qtdeReprovados = 0;

        // Início do laço que será executado até que o usuário digite "FIM"
        do {
            System.out.print("Digite o nome do aluno (ou 'FIM' para encerrar): ");
            nome = sc.nextLine();

            if (nome.equalsIgnoreCase("FIM")) {
                break; // Se o nome for "FIM", sai do laço
            }

            // Lê as três notas do aluno
            System.out.print("Digite a primeira nota: ");
            nota1 = sc.nextDouble();
            System.out.print("Digite a segunda nota: ");
            nota2 = sc.nextDouble();
            System.out.print("Digite a terceira nota: ");
            nota3 = sc.nextDouble();
            sc.nextLine(); // limpa o buffer do enter

            // calcula a média do aluno
            media = (nota1 + nota2 + nota3) / 3;

            // Exibe nome, média e status do aluno (aprovado/reprovado)
            System.out.printf("Aluno: %s - Média: %.2f - ", nome, media);
            if (media >= 60.0) {
                System.out.println("Aprovado");
                qtdeAprovados++;
            } else {
                System.out.println("Reprovado");
                qtdeReprovados++;
            }

            somaMedias += media; // acumula a média dos alunos
            qtdeAlunos++; // incrementa cada aluno informado

        } while (true);

        if (qtdeAlunos > 0) {
            double mediaClasse = somaMedias / qtdeAlunos;
            System.out.printf("\nMédia da classe: %.2f\n", mediaClasse);
            System.out.printf("Total de alunos aprovados: %d\n", qtdeAprovados);
            System.out.printf("Total de alunos reprovados: %d\n", qtdeReprovados);
        } else {
            System.out.println("\nNenhum aluno foi digitado.");
        }

        sc.close();
    }
}

