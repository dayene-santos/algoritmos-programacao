/* Exercicio02 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/27
 */
package Atividade08; // define o pacote onde a classe está localizada

import java.util.Scanner;

public class Exercicio02 { // início da classe principal
    public static void main(String[] args) { // método principal, ponto de entrada do programa
        Scanner sc = new Scanner(System.in); // criando objeto Scanner para receber dados do teclado

        // variável que contém a descrição dos produtos
        String[] produtos = new String[]{
                            "Sabonete Neutro",
                            "Shampoo Anticaspa 300ml",
                            "Creme Dental Menta 90g",
                            "Detergente Limão 500ml",
                            "Pão de Forma Integral 500g",
                            "Leite Integral 1L",
                            "Achocolatado em Pó 400g",
                            "Arroz Branco Tipo 1 – 5kg",
                            "Feijão Carioca 1k",
                            "Óleo de Soja 900ml"};

        // variável que contém os preços iniciais
        double[] preco = new double[]{2.49, 15.90, 4.75, 2.10, 7.60, 4.29, 6.85, 22.90, 8.40, 6.99};
        double porcentagem; // variável que armazenará a porcentagem de aumento informada pelo usuário
        double precoAntigo; // variável temporária que armazena o preço anterior à atualização

        // solicita ao usuário que informe a porcentagem de aumento a ser aplicada
        System.out.print("Digite a porcentagem de aumento dos produtos: ");
        porcentagem = sc.nextDouble();

        // laço que percorre todos os produtos e atualiza seus preços
        for(int i =0; i < produtos.length; i++){
            precoAntigo = preco[i]; // guarda o valor inicial antes da alteração
            preco[i] += preco[i] * porcentagem / 100; // aplica o aumento percentual ao preço

            // impressão das informações para o usuário
            System.out.print("\nProduto: " + produtos[i]);
            System.out.printf("\nPreço anterior: R$ %.2f%n", precoAntigo);
            System.out.printf("Aumento aplicado: %.1f %%", porcentagem);
            System.out.printf("\nPreço atual: R$ %.2f%n\n", preco[i]);
            System.out.println("---------------------------------------"); // separador visual
        }

        sc.close(); // fecha o scanner (boas práticas para liberar recursos)

    }
}
