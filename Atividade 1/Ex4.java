/*1) Crie um algoritmo que receba do usu�rio um n�mero qualquer e verifique se esse n�mero � m�ltiplo de 5.*/

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