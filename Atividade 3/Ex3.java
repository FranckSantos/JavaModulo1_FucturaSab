/* 4) Escreva um algoritmo que solicite uma sequ�ncia de n�meros  ao usu�rio e realize a soma desses n�meros. 
Encerre a execu��o quando zero ou um n�mero negativo for digitado */

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int soma, numero;
		soma = 0;
		System.out.print("Digite um n�mero: ");
		numero = input.nextInt();
		while (numero > 0) {
			soma = soma + numero;
			System.out.print("Digite um n�mero: ");
			numero = input.nextInt();
		}
		System.out.println("A soma dos n�meros �: " + soma);
		input.close();

	}
}