 /* Exercicio04 application
  *
  * @ author Dayene dos Santos Rosa - 12127152
  * @ version 1.00 2025/05/06
  */
package Atividade06.A_forloop;

 public class Exercicio04 {
    public static void main(String[] args) {

        // Este programa imprime todos os números ímpares de 0 a 99.
        for(int i=0; i<100; i++){
            // teste para verificar se o número é ímpar
            if(i % 2 != 0 ){
                System.out.println(i);
            }
        }
    }
}
