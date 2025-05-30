/* Exercicio01 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/26
 */
package Atividade08; // define o pacote onde a classe está localizada
import java.util.Scanner; // importa a classe Scanner para recceber dados do teclado

public class Exercicio01 { // início da classe principal
    public static void main(String[] args) { // método principal, ponto de entrada do programa
        Scanner sc = new Scanner(System.in); // criando objeto scanner para receber dados via teclado

        int[] numeros = new int[]{21, 12, 5, 73, 98}; // vetor de 5 números inteiros
        int tentativa; // variável para armazenar o número digitado pelo usuário
        boolean encontrou = false; // variável que controla se o número foi encontrado no vetor
        String resposta; // variável que recebe a resposta do usuário sobre continuar tentando

        // loop que continua até o número ser encontrado ou o usuário decidir parar
        do {
            System.out.print("Digite um número inteiro por favor: "); // exibe mensagem ao usuário
            tentativa = sc.nextInt(); // lê o número digitado pelo usuário

            // percorre o vetor procurando o número digitado
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == tentativa) { // se encontrar o número
                    System.out.print("\nParabéns, o número " + tentativa + " faz parte do vetor!"); // exibe mensagem ao usuário
                    System.out.print("\nEle está no índice: " +i); // mostra a posição
                    encontrou = true; // marca que encontrou
                    break; // interrompe o laço for
                }
            }

            // se o número não for encontrado
            if (!encontrou) {
                System.out.println("Infelizmente o número digitado não faz parte do vetor.\n");
                System.out.print("Deseja tentar novamente? (s/n): "); // pergunta se quer tentar de novo
                resposta = sc.next(); // lê a resposta do usuário

                // se a resposta for "n" (não), sai do loop
                if (resposta.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }    while (!encontrou); // repete enquanto o número não for encontrado

            System.out.print("\nVetor: "); // exibe o valor completo no final
            for (int numero : numeros) { // loop for-each para mostrar todos os números
            System.out.print(" " + numero + " ");
            }
            sc.close(); // fechar o scanner (boas práticas para liberar recurso)
    }
}