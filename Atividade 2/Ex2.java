/*2) Escreva um algoritmo que leia uma letra que represente o sexo de uma pessoa
 (M para Masculino e F para feminino).  Se  for  masculino,  mostra  a  mensagem  
 “Seja  bem-vindo,  Senhor!”,  se  for  feminino,  mostra  a mensagem “Seja bem-vinda, Senhora!”. */

import java.util.Scanner;  
 public class Ex2 { 
      public static void main(String [] args){ 
         Scanner input = new Scanner (System.in); 
         String sexo; 
         System.out.print("Digite seu sexo (M - para masculino / F - para feminino:"); 
         sexo = input.next(); 
         if (sexo.equals("m")){ 
             System.out.print("Seja bem-vindo, Senhor!"); 
          }else if (sexo.equals("f")){ 
              System.out.print("Seja bem-vinda, Senhora!"); 
          } 
       } 
  } 