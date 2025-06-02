/* ContaDeLuz application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/31
 */
package Desafio;

import java.util.Scanner;

public class ContaDeLuz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário pelo teclado

        String[] clientes = new String[20]; // Vetor para armazenar os nomes dos 20 clientes
        int[] codigoCliente = new int[20]; // Vetor para armazenar os códigos numéricos dos clientes
        double[] mediaConsumo = new double[20]; // Vetor para armazenar a média de consumo de energia (em kWh) de cada cliente
        double[] mediasValor = new double[20]; // Vetor para armazenar o valor médio pago de cada cliente (média consumo * tarifa)
        double tarifa; // Variável para armazenar o valor da tarifa de energia (R$ por kWh)

        // Ler o valor da tarifa (R$ - KWh)
        System.out.print("Digite o valor da tarifa (R$ por kWh): ");
        tarifa = sc.nextDouble();  // Lê a tarifa informada pelo usuário
        sc.nextLine(); // limpar buffer do scanner para evitar problemas na leitura das próximas strings

        // Loop para cadastro dos clientes
        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastro do cliente " + (i + 1));

            System.out.print("Digite o nome do cliente: ");
            clientes[i] = sc.nextLine();  // Lê o nome do cliente

            System.out.print("Digite o código do cliente: ");
            codigoCliente[i] = sc.nextInt();  // Lê o código numérico do cliente

            System.out.print("Digite a média do consumo (kWh): ");
            mediaConsumo[i] = sc.nextDouble();  // Lê a média de consumo em kWh

            sc.nextLine(); // limpar buffer para próxima leitura de string

            // Calcula o valor médio pago pelo cliente (média consumo * tarifa)
            mediasValor[i] = mediaConsumo[i] * tarifa;
        }

        System.out.println("\nCadastro finalizado com sucesso!");

        // Menu de consultas - variavel para controlar escolha do usuário
        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Consultar por nome");
            System.out.println("2 - Consultar por código");
            System.out.println("3 - Mostrar tabela completa");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();  // lê a opção escolhida
            sc.nextLine(); // limpar buffer para evitar problemas ao ler strings depois

            switch (opcao) {
                case 1:
                    // Consulta por nome
                    System.out.print("Digite o nome do cliente para consulta: ");
                    String nomeBusca = sc.nextLine();  // lê o nome para busca
                    boolean encontradoNome = false;  // indicar se encontrou

                    // Loop para buscar o nome no vetor
                    for (int i = 0; i < 20; i++) {
                        // compara ignorando maiúsculas/minúsculas
                        if (clientes[i].equalsIgnoreCase(nomeBusca)) {
                            // Se encontrado, imprime dados do cliente
                            System.out.println("Cliente encontrado:");
                            System.out.println("Nome: " + clientes[i]);
                            System.out.println("Código: " + codigoCliente[i]);
                            System.out.println("Média de consumo: " + mediaConsumo[i] + " kWh");
                            System.out.println("Valor médio pago: R$ " + mediasValor[i]);
                            encontradoNome = true;
                            break;  // sai do loop após encontrar o cliente
                        }
                    }
                    if (!encontradoNome) {
                        System.out.println("Cliente não encontrado com o nome: " + nomeBusca);
                    }
                    break;

                case 2:
                    // Consulta por código
                    System.out.print("Digite o código do cliente para consulta: ");
                    int codigoBusca = sc.nextInt();  // lê código para busca
                    sc.nextLine(); // limpar buffer
                    boolean encontradoCodigo = false;  // indicar se encontrou

                    // Loop para buscar o código no vetor
                    for (int i = 0; i < 20; i++) {
                        if (codigoCliente[i] == codigoBusca) {
                            // Se encontrado, imprime dados do cliente
                            System.out.println("Cliente encontrado:");
                            System.out.println("Nome: " + clientes[i]);
                            System.out.println("Código: " + codigoCliente[i]);
                            System.out.println("Média de consumo: " + mediaConsumo[i] + " kWh");
                            System.out.println("Valor médio pago: R$ " + mediasValor[i]);
                            encontradoCodigo = true;
                            break;  // sai do loop após encontrar o cliente
                        }
                    }
                    if (!encontradoCodigo) {
                        System.out.println("Cliente não encontrado com o código: " + codigoBusca);
                    }
                    break;

                case 3:
                    // Mostrar tabela completa formatada
                    System.out.printf("%-20s %-10s %-20s %-20s%n", "Nome", "Código", "Média Consumo (kWh)", "Valor Médio Pago (R$)");
                    System.out.println("-------------------------------------------------------------------------------");

                    for (int i = 0; i < 20; i++) {
                        // imprime cada linha da tabela com espaçamento alinhado e duas casas decimais para valores
                        System.out.printf("%-20s %-10d %-20.2f %-20.2f%n", clientes[i], codigoCliente[i], mediaConsumo[i], mediasValor[i]);
                    }
                    break;

                case 4:
                    // Opção para encerrar o programa
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    // Caso o usuário digite uma opção inválida
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);  // repete o menu enquanto o usuário não escolher sair

        sc.close(); // Fecha o scanner para liberar recursos do sistema
    }
}