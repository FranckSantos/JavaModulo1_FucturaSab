/*7) Fazer um programa que recebe os valores dos tr�s lados de um tri�ngulo. 
-Com esses tr�s valores, deve informar se o tri�ngulo � equil�tero (tr�s lados iguais), 
is�sceles (dois lados iguais) ou escaleno (tr�s lados diferentes).
 -Antes tem que analisar se os valores digitados dos lados formam um tri�ngulo;
 -OBS: para ser considerado um tri�ngulo, a soma dos dois lados precisa ser maior que o terceiro lado. */


import java.util.Scanner;

public class Ex7{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C; 
      
        System.out.print("Digite o lado A = ");
        A = input.nextInt(); 
		
        System.out.print("Digite o lado B = ");
        B = input.nextInt(); 
		
	System.out.print("Digite o lado C = ");
        C = input.nextInt(); 


		if( A < B + C && B < A + C && C < A + B ){  //Verifica se cada lado � menor que a soma dos outros dois lados.
			if(A == B && B == C){ 
				System.out.print("O tri�ngulo � Eq�il�tero.");//tr�s lados iguais
			}else if(A == B || A == C || B == C){ 
				System.out.print("O tri�ngulo � Is�sceles.");//dois lados iguais
			}else{ 
				System.out.print("O tri�ngulo � Escaleno.");//tr�s lados diferentes
			}
		}else{ 
			System.out.print("Os lados fornecidos n�o formam um tri�ngulo");
		}

    }

}