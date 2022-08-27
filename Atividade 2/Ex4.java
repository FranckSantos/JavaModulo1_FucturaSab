/*5) Escreva um algoritmo que leia dois números e apresente o resultado da operação de acordo com um menu, com 4 opções:
 1) Somar os números; 2) Subtrair os números; 3) Multiplicar os números; 4) Dividir os números. 
 Leia a opção do usuário e execute a operação e apresente o resultado. 
 Caso a opção digitada seja inválida, apresente a mensagem de “Opção inválida” para o usuário.   */

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, opcao, resultado = 0;

		System.out.print("Digite o primeiro número: ");
		num1 = input.nextInt();
		
		System.out.print("Digite o segundo número: ");
		num2 = input.nextInt();
		
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Somar ");
		System.out.println("2 - Subtrair ");
		System.out.println("3 - Multiplicar ");
		System.out.println("4 - Dividir ");
		opcao = input.nextInt();

		
		if (opcao == 1) {
			resultado = n1 + n2;
			
		} else if (opcao == 2) {
			resultado = n1 - n2;
			
		} else if (opcao == 3) {
			resultado = n1 * n2;
		} else if (opcao == 4) {
			resultado = n1 / n2;
			
		} else {
			System.out.println("Opção inválida");
			
		}
		
		System.out.println("O resultado é: " + resultado);

	}
}