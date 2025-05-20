/* Exercicio15 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/11
 */
package Atividade06.C_dowhileloop;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        int criancas=0; // 0 a 12 anos
        int adolescentes=0; // 13 a 21 anos
        int adultos=0; // 22 a 60 anos
        int idosos=0; // acima de 60 anos

        do {
            System.out.print("Digite uma idade: (ou digite -1 para encerrar.):  ");
            idade =  sc.nextInt();

            if (idade == -1) break; // evita que o -1 seja classificado em alguma categoria

            // verifica em qual categoria cada idade se encaixa
            if (idade >= 0 && idade <= 12) {
                criancas++;
            } else if(idade <= 21) {
                adolescentes++;
            } else if (idade <= 60) {
                adultos++;
            } else if (idade > 60) {
                idosos++;
            }

        } while (true);
        // imprime o total de pessoas para cada faixa etária
        System.out.println("Total de pessoas na faixa etária de 0 a 12 anos: " + criancas);
        System.out.println("Total de pessoas na faixa etária de 13 a 21 anos: " + adolescentes);
        System.out.println("Total de pessoas na faixa etária de 22 a 60 anos: " + adultos);
        System.out.println("Total de pessoas na faixa etária acima de 60 anos: " + idosos);

        sc.close();

    }
}
