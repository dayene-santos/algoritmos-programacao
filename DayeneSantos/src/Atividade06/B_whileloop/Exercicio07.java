/* Exercicio07 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/07
 */
package Atividade06.B_whileloop;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // variáveis e contadores para efetuar os cálculos
        int feminino=0, masculino=0, totalPessoas;
        double alturaFeminina = 0, alturaMasculina=0, diferenca;
        double altura, maiorAltura = 0, mediaFeminina=0;
        double menorAltura = Double.MAX_VALUE; //  inicializa a variável com um valor muito alto para não haver erro durante o código
        double percentualHomens, percentualMulheres;
        char sexo;

        // inicializa o contador
        int i = 0;
        while (i < 50) { // loop para 50 pessoas
            System.out.print("Digite o sexo da pessoa: ");
            sexo = sc.next().toUpperCase().charAt(0); // Lê o sexo e converte minúsculas em maiúsculas

            System.out.print("Digite a altura dessa pessoa: ");
            altura = sc.nextDouble();

            if(altura > maiorAltura){
                maiorAltura = altura;
            }
            if (altura < menorAltura){
                menorAltura = altura;
            }
            // soma as alturas e conta a quantidade de femininos e masculinos
            if(sexo == 'F') {
                feminino++;
                alturaFeminina += altura;
            } else if(sexo == 'M') {
                masculino++;
                alturaMasculina += altura;
            } else {
                System.out.println("Sexo inválido! Informe M para masculino ou F para feminino.");
                continue;
            }
            i++;
        }

        // se houver mulheres, calcula a média de altura delas
        if(feminino > 0){
            mediaFeminina = alturaFeminina / feminino;
        }

        // calcula os percentuais de homens e mulheres
        totalPessoas = feminino + masculino;
        percentualHomens = ((double) masculino / totalPessoas) * 100;
        percentualMulheres = ((double) feminino / totalPessoas) * 100;
        diferenca = Math.abs(percentualHomens - percentualMulheres);

        // Exibe os resultados
        System.out.printf("\nMaior altura do grupo: %.2fm%n", maiorAltura);
        System.out.printf("Menor altura do grupo: %.2fm%n", menorAltura);
        System.out.printf("Média de altura das mulheres: %.2fm%n", mediaFeminina);
        System.out.println("Número de homens: " + masculino);
        System.out.printf("Diferença percentual entre homens e mulheres: %.2f%%%n", diferenca);

        sc.close();
    }
}
