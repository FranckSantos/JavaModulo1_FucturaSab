/*7) Fazer um programa que recebe os valores dos três lados de um triângulo. 
-Com esses três valores, deve informar se o triângulo é equilátero (três lados iguais), 
isósceles (dois lados iguais) ou escaleno (três lados diferentes).
 -Antes tem que analisar se os valores digitados dos lados formam um triângulo;
 -OBS: para ser considerado um triângulo, a soma dos dois lados precisa ser maior que o terceiro lado. */


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


		if( A < B + C && B < A + C && C < A + B ){  //Verifica se cada lado é menor que a soma dos outros dois lados.
			if(A == B && B == C){ 
				System.out.print("O triângulo é Eqüilátero.");//três lados iguais
			}else if(A == B || A == C || B == C){ 
				System.out.print("O triângulo é Isósceles.");//dois lados iguais
			}else{ 
				System.out.print("O triângulo é Escaleno.");//três lados diferentes
			}
		}else{ 
			System.out.print("Os lados fornecidos não formam um triângulo");
		}

    }

}