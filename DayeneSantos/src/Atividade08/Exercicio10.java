/* Exercicio10 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/31
 */
package Atividade08;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] linguagens = new String[]{"Java", "Python", "JavaScript", "C", "C++",
                                         "CSharp", "Ruby", "Go", "Swift", "Kotlin",
                                         "PHP", "TypeScript", "Rust", "Assembly",
                                         "SQL", "HTML", "CSS"};

        String busca;// Declara a variável que armazenará a palavra digitada pelo usuário
        int contador=0; // Variável para contar quantas vezes a palavra foi encontrada

        // Solicita ao usuário que digite uma palavra para buscar no vetor
        System.out.println("Digite uma linguagem de programação para buscar no vetor: ");
        busca = sc.nextLine();

        // Exibe o início da mensagem indicando onde a palavra será encontrada (se for)
        System.out.print("A palavra \"" + busca + "\" aparece nas posições: ");

        // Percorre o vetor de linguagens
        for(int i = 0; i < linguagens.length; i ++) {
            // Compara a palavra atual do vetor com a palavra digitada,
            // ignorando se estão em maiúsculas ou minúsculas
            if(linguagens[i].equalsIgnoreCase(busca)) {
                contador++; // Incrementa o contador de ocorrências
                System.out.print(i + " "); // Mostra a posição onde a palavra foi encontrada
            }
        }

        // Se a palavra não for encontrada em nenhuma posição
        if(contador == 0){
            System.out.println("Nenhuma");
        }
        // Exibe o total de vezes que a palavra foi encontrada
        System.out.println("\nTotal de Ocorrências: " + contador);

        sc.close();// Fecha o Scanner (boa prática para liberar recursos)
    }
}
