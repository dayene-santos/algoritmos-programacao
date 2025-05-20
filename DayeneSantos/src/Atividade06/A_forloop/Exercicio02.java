/* Exercicio02 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/06
 */
package Atividade06.A_forloop;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // declarando as variáveis e seus tipos de dados
        String aluno;
        double nota1, nota2, nota3, mediaAluno, mediaClasse = 0, somaMedias = 0;
        int qtdeAlunos = 0, qtdeAprovados = 0, qtdeReprovados = 0;
        // entrada para definir a quantidade de alunos que serão avaliados
        System.out.print("Digite a quantidade de alunos: ");
        qtdeAlunos = sc.nextInt();
        sc.nextLine(); // consumir a quebra de linha que fica armazenada no buffer

        // loop para ler o nome dos alunos e suas respectivas notas
        for (int i = 0; i < qtdeAlunos; i++) {
            System.out.print("Digite o nome do aluno: "); // lê o nome do aluno
            aluno = sc.nextLine();

            System.out.printf("Insira a 1ª nota de %s: ", aluno);  // lê a primeira nota
            nota1 = sc.nextDouble();

            System.out.printf("Insira a 2ª nota de %s: ", aluno); // lê a segunda nota
            nota2 = sc.nextDouble();

            System.out.printf("Insira a 3ª nota de %s: ", aluno); // lê a terceira nota
            nota3 = sc.nextDouble();
            sc.nextLine(); //consome a quebra de linha que fica armazenada no buffer

            mediaAluno = (nota1 + nota2 + nota3) / 3; // calcula a média do aluno

            somaMedias += mediaAluno; // armazena a media de cada aluno avaliado
            // verifica se o aluno está acima ou abaixo da média
            if (mediaAluno >= 60) {
                qtdeAprovados++;
            } else {
                qtdeReprovados++;
            }
        }
        // calcula a média da turma
        mediaClasse = somaMedias / qtdeAlunos;

        System.out.printf("A média dessa turma é de: %.1f", mediaClasse); // imprime a média da turma
        // imprime a quantidade de alunos aprovados e reprovados com tratamento de singular e plural
        if (qtdeAprovados == qtdeAlunos) {
            System.out.printf("\nNesta turma todos os %d alunos foram aprovados.", qtdeAlunos);
        } else if (qtdeReprovados == qtdeAlunos) {
            System.out.printf("\nNesta turma todos os %d alunos foram reprovados.", qtdeAlunos);
        } else if(qtdeAprovados > 1 && qtdeReprovados > 1) {
            System.out.printf("\nNesta turma %d alunos foram aprovados e %d alunos foram reprovados", qtdeAprovados, qtdeReprovados);
        } else if( qtdeAprovados >1 && qtdeReprovados <2){
            System.out.printf("\nNesta turma %d alunos foram aprovados e %d aluno foi reprovado", qtdeAprovados, qtdeReprovados);
        } else if( qtdeAprovados <2 && qtdeReprovados >1) {
            System.out.printf("\nNesta turma %d aluno foi aprovado e %d alunos foram reprovados", qtdeAprovados, qtdeReprovados);
        } else if (qtdeAprovados == 1 && qtdeReprovados == 1) {
            System.out.printf("\nNesta turma %d aluno foi aprovado e %d aluno foi reprovado", qtdeAprovados, qtdeReprovados);
        }

        sc.close();
    }
}