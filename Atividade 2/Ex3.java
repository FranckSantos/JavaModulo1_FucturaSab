/*4) Crie um algoritimo e escrever se um ano informado pelo usuário é
bissexto ou não. 
Um ano é bissexto quando é
(divisível por 400) ou é (divisível por 4 e não por 100);   */

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um ano para saber se é bissexto");
        int ano = input.nextInt();
 
        if(ano % 400 == 0){
            System.out.println(ano + " é bissexto.");
  
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " é bissexto.");
        } else{
            System.out.println(ano + " não é bissexto");
        }
    }
}