/* 5)Escreva um algoritmo que leia 20 n�meros digitados pelo usu�rio e exiba quantos n�meros s�o pares. */

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int soma = 0;
		for(int i = 1; i <= 20; i++) {
			System.out.print("Digite um n�mero: ");
			num = input.nextInt();
			if(num % 2 == 0) {
				soma++;
			}
		}
			System.out.println("Quantidade de n�meros pares: " + soma);
			input.close();
	}

}