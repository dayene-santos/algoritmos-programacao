/* Exercicio05 application
 * 
 * @ author Dayene dos Santos Rosa - 12127152
 * @ version 1.00 2025/03/25
 */

package Atividade04;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double capacidadeTanque, litrosAbastecidos, distanciaPercorrida, consumoMedio, autonomia;
		
		System.out.print("Qual a capacidade do tanque em litros? ");
			capacidadeTanque = sc.nextDouble();
		
		System.out.print("Quantos litros foram abastecidos?");
			litrosAbastecidos = sc.nextDouble();
		
		System.out.print("Qual a distância percorrida desde o último abastecimento? ");
			distanciaPercorrida = sc.nextDouble();
			
			consumoMedio = distanciaPercorrida / litrosAbastecidos;
			autonomia = consumoMedio * capacidadeTanque;
			
		System.out.printf("O consumo médio foi de %.2f km/l\n", consumoMedio);
		System.out.printf("Autonomia estimada de %.2f km\n", autonomia);
		
		sc.close();
	}

}
