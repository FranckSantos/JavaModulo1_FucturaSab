/*2) Escreva um algoritmo que leia uma letra que represente o sexo de uma pessoa 
(M para Masculino e F para feminino).  Se  for  masculino,  mostra  a  mensagem 
 �Seja  bem-vindo,  Senhor!�,  se  for  feminino,  mostra  a mensagem �Seja bem-vinda, Senhora!�. */

 import java.util.Scanner;

 public class Ex1 {
 
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Digite um n�mero: ");
         int num = input.nextInt();
         
         if (num % 5 == 0) {
             System.out.println("M�ltiplo de 5.");
         }else {
             System.out.println("N�mero n�o � m�ltiplo de 5.");
         }
         
         input.close();
 
     }
 
 }