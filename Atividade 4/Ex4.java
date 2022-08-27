/* 5) Criar um vetor que receba 4 notas de um aluno, calcule a m�dia dessas notas e
 verificar se o aluno foi aprovado, est� em recupera��o ou foi reprovado. 
A m�dia de 7 at� 10 o aluno � APROVADO. 
A m�dia de 3 at� 6.9 o aluno vai para RECUPERA��O e a
m�dia menor que 3 o aluno � REPROVADO. */

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] notas = new double[4];

		double somaNotas = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %d� nota: ", i + 1);
			notas[i] = sc.nextDouble();
			somaNotas += notas[i];
		}

		double media = somaNotas / 4;

		System.out.printf("A media do aluno �: %.2f ", media);

		System.out.println();
		if (media >= 7) {
			System.out.println("O aluno foi aprovado!");

		} else if (media >= 3 && media < 7) {
			System.out.println("O aluno est� de recupera��o!");

		} else {
			System.out.println("O aluno est� reprovado!");
		}
		sc.close();
	}
}
