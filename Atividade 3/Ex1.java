/* 2) Crie um algoritmo para mostrar a tabuada de multiplica��o de um n�mero informado pelo usu�rio. */

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero: ");

		int num = input.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.print(num + " X " + i + " = " + num * i);
		}
		input.close();
	}
}
