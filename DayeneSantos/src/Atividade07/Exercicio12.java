/* Exercicio12 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/21
 */

public class Exercicio12 {
    public static void main(String[] args) {

        // vetor que armazena os nomes
        String[] nomes = new String[]{"Daniel", "Dayene", "Luis", "Maria Paula", "Patrick",
                                      "Vinicius", "Brunna", "Talita", "Izabella", "Kelly"};
        // vetor que armazena as idades
        int[] idade = new int[]{21, 28, 28, 22, 20, 28, 33, 30, 31, 37};

        // vetor que armazena as alturas
        double[] altura = new double[]{1.70, 1.64, 1.75, 1.68, 1.70, 1.69, 1.72, 1.63, 1.72, 1.69};

        // loop que imprime os dados de cada pessoa: nome, idade e altura
        for (int i =0; i < nomes.length; i++ ) {
            System.out.println("Nome  : " + nomes[i]);
            System.out.println("Idade : " + idade[i] + " anos");
            System.out.printf("Altura: %.2fm\n", altura[i]);
            System.out.println("---------------------------");
        }
    }
}
