/* 4) Escreva um algoritmo que solicite uma sequência de números  ao usuário e realize a soma desses números. 
Encerre a execução quando zero ou um número negativo for digitado */

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int soma, numero;
		soma = 0;
		System.out.print("Digite um número: ");
		numero = input.nextInt();
		while (numero > 0) {
			soma = soma + numero;
			System.out.print("Digite um número: ");
			numero = input.nextInt();
		}
		System.out.println("A soma dos números é: " + soma);
		input.close();

	}
}