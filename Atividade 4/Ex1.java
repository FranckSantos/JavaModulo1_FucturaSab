/* 2) Crie um vetor de inteiros, atribua valores ao vetor e imprima a soma dos seus elementos. */

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;

		int[] vetor = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o numero para o índice " + i + ": ");
			vetor[i] = sc.nextInt();
			soma += vetor[i];
		}
		System.out.println("\nElementos do vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println("\n\nSoma dos elementos do vetor: " + soma);
		
		sc.close();
	}
}