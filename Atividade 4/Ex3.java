/* 4) Declarar um vetor de inteiros e imprimir o menor e maior valor do vetor. */

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Qual o tamanho do vetor? ");
		int tam = input.nextInt();

		int[] vetor = new int[tam];

		int i;
		
		//atribuindo valores ao vetor:
		for (i = 0; i < tam; i++) {
			System.out.print("Digite o numero para a posição " + i + " :");
			int num = input.nextInt();
			vetor[i] = num;
		}
		//verificando o maior elemento:
		int maior = vetor[0];
		for (i = 1; i < tam; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}

		//verificando o menor elemento:
		int menor = vetor[0];
		for (i = 0; i < tam; i++) {
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		//imprimindo todos os elementos do vetor:
		System.out.print("\nVetor: ");
		for (i = 0; i < tam; i++) {
			System.out.print(vetor[i] + " ");
		}

		System.out.println("\n\nMenor Valor: " + menor);
		System.out.print("Maior Valor: " + maior);

		// OUTRA FORMA
//		Arrays.sort(vetor); //ordenar em ordem crescente
//		for (i = 0; i < tam; i++) {
//			System.out.println(vetor[i]);
//		}
//      
//      int maior = vetor.length - 1; //estando em ordem crescente, o maior valor é o último
//      int menor = vetor[0]; //menor valor é o primeiro
//      
//      System.out.println("Maior = "+maior+"\nMenor = "+menor);
		input.close();

	}
}
