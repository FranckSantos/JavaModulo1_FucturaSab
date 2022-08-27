/* 3) Criar um vetor que receba 10 (dez) números. Imprima os elementos do vetor na ordem que foram digitados e na ordem inversa. */

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o numero para o índice " + i + ": ");
			vetor[i] = sc.nextInt();
		}

		System.out.println("\nOrdem que foram digitados os elementos: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

		System.out.println("\n\nOrdem inversa dos elementos: ");
		for (int i = vetor.length - 1; i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}

		sc.close();
	}
}