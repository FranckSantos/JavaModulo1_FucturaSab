/*4) Crie um algoritimo e escrever se um ano informado pelo usu�rio �
bissexto ou n�o. 
Um ano � bissexto quando �
(divis�vel por 400) ou � (divis�vel por 4 e n�o por 100);   */

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um ano para saber se � bissexto");
        int ano = input.nextInt();
 
        if(ano % 400 == 0){
            System.out.println(ano + " � bissexto.");
  
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " � bissexto.");
        } else{
            System.out.println(ano + " n�o � bissexto");
        }
    }
}