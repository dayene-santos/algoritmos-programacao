/* Exercicio10 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/04/01 
 */
package AtividadePrática5;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int codigo, qtde;
		double preco=0, total_nota, desconto, valor_final;
		
		System.out.print("Digite o código do produto: ");
			codigo = sc.nextInt();
				
		System.out.print("Digite a quantidade comprada: ");
			qtde = sc.nextInt();
		System.out.println("");
			
			if(codigo >=1 && codigo <=10) {
				preco = 10;
				System.out.printf("O preço unitário do produto é: R$%.2f\n", preco);
			} else if (codigo > 10 && codigo <=20) {
				preco = 15;
				System.out.printf("O preço unitário do produto é: R$%.2f\n", preco);
			} else if (codigo > 20 && codigo <=30) {
				preco = 20;
				System.out.printf("O preço unitário do produto é: R$%.2f\n", preco);
			} else if(codigo > 30 && codigo <=40){
				preco = 30;
				System.out.printf("O preço unitário do produto é: R$%.2f\n", preco);
			} else {
				System.out.println("CÓDIGO INVÁLIDO! Digite um valor entre 1 e 40");
			}
				
			total_nota = qtde * preco;
			
			if(total_nota <= 250.00) {
				desconto = total_nota * 0.05;
			} else if(total_nota >250.00 && total_nota <= 500.00) {
				desconto = total_nota * 0.10;
			} else {
				desconto = total_nota * 0.15;
			}
			
			valor_final = total_nota - desconto;
			
			System.out.printf("O valor total da nota é de R$%.2f\n", total_nota);
			System.out.printf("O desconto aplicado foi de R$%.2f\n", desconto);
			System.out.printf("O valor da nota com desconto é de R$%.2f", valor_final);
		
		sc.close();
	}

}
