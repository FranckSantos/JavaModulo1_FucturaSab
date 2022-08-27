/*4) Faça um programa que leia dois valores inteiros para as variáveis A e B, 
em seguida efetuar a troca dos valores das variáveis de modo que a variável A
 passe a possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. 
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