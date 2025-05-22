/* Exercicio08 application
 *
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/05/21
 */

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // cria o objeto scanner para receber dados do usuário pelo teclado

        int a = 0, e = 0, i = 0, o = 0, u = 0;// cria a variavel de contador para cada vogal
        char[] letras = new char[10]; // cria o vetor que vai armazenar as letras inseridas

        // loop que vai receber as letras digitadas pelo usuário
        for (int j = 0; j < letras.length; j++) {
            System.out.print("Digite a " + (j + 1) + "ª letra: "); // mostra ao usuário o que deve ser inserido no terminal
            letras[j] = sc.nextLine().toUpperCase().charAt(0); // Isso evita problemas com maiúsculas/minúsculas e permite capturar apenas o primeiro caractere digitado

            // verifica se foi digitada alguma vogal
            if (letras[j] == 'A') a++; // se digitar a, incrementa 1 a variavel contador
            if (letras[j] == 'E') e++; // se digitar e, incrementa 1 a variavel contador
            if (letras[j] == 'I') i++; // se digitar i, incrementa 1 a variavel contador
            if (letras[j] == 'O') o++; // se digitar o, incrementa 1 a variavel contador
            if (letras[j] == 'U') u++; // se digitar u, incrementa 1 a variavel contador
        }
            // soma a quantidade de vogais inseridas
            int totalVogais = a + e + i + o + u;

            //verifica se a quantidade de vogais é maior que zero
            if (totalVogais > 0) {
                // exibe a quantidade de vogais inseridas, se for 1, exibe singular
                System.out.println("Foram digitadas " + totalVogais + (totalVogais == 1 ? " vogal:" : " vogais:"));
                if (a > 0) System.out.println("A = " + a); // exibe a quantidade de letras 'A' inseridas se houver
                if (e > 0) System.out.println("E = " + e); // exibe a quantidade de letras 'E' inseridas se houver
                if (i > 0) System.out.println("I = " + i); // exibe a quantidade de letras 'I' inseridas se houver
                if (o > 0) System.out.println("O = " + o); // exibe a quantidade de letras 'O' inseridas se houver
                if (u > 0) System.out.println("U = " + u); // exibe a quantidade de letras 'U' inseridas se houver
            } else {
                System.out.println("Não foi digitada nenhuma vogal."); // avisa se nenhuma vogal for inserida
            }
            sc.close(); // encerra o scanner (boas práticas)
    }
}
