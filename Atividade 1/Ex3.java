/*4) Fa�a um programa que leia dois valores inteiros para as vari�veis A e B, 
em seguida efetuar a troca dos valores das vari�veis de modo que a vari�vel A
 passe a possuir o valor da vari�vel B, e a vari�vel B passe a possuir o valor da vari�vel A. 
 Apresentar os valores trocados.*/

public class Ex4 {

	public static void main(String[] args) {
	
	        int A = 25;
                int B = 40;

		System.out.println("Valores antes da troca:");
                System.out.println("Valor de A: " + A);
                System.out.println("Valor de B: " + B);
     
		int aux = A;
		A = B;
		B = aux;
                System.out.println("Valores depois da troca:");
                System.out.println("Valor de A: " + A);
                System.out.println("Valor de B: " + B);

	}

}