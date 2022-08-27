/* 5) Criar um vetor que receba 4 notas de um aluno, calcule a média dessas notas e
 verificar se o aluno foi aprovado, está em recuperação ou foi reprovado. 
A média de 7 até 10 o aluno é APROVADO. 
A média de 3 até 6.9 o aluno vai para RECUPERAÇÃO e a
média menor que 3 o aluno é REPROVADO. */

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] notas = new double[4];

		double somaNotas = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %dª nota: ", i + 1);
			notas[i] = sc.nextDouble();
			somaNotas += notas[i];
		}

		double media = somaNotas / 4;

		System.out.printf("A media do aluno é: %.2f ", media);

		System.out.println();
		if (media >= 7) {
			System.out.println("O aluno foi aprovado!");

		} else if (media >= 3 && media < 7) {
			System.out.println("O aluno está de recuperação!");

		} else {
			System.out.println("O aluno está reprovado!");
		}
		sc.close();
	}
}
