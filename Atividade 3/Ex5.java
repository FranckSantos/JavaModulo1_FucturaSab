/* 1) Crie um vetor de inteiros de 10 posi��es e atribua valores utilizando estrutura de repeti��o, em seguida imprimir os seus elementos. */

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// declara��o de vetor
		int[] vetor = new int[10];

		// entrada de dados
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o numero para o �ndice " + i + ": ");
			vetor[i] = sc.nextInt();
		}
		// Sa�da de dados (Valores do vetor)
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		sc.close();
	}
}