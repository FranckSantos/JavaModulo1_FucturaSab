/*1) Crie um algoritmo que receba do usuário um número qualquer e verifique se esse número é múltiplo de 5.*/

 import java.util.Scanner;

 public class Ex1 {
 
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Digite um número: ");
         int num = input.nextInt();
         
         if (num % 5 == 0) {
             System.out.println("Múltiplo de 5.");
         }else {
             System.out.println("Número não é múltiplo de 5.");
         }
         
         input.close();
 
     }
 
 }