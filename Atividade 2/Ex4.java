/*5) Escreva um algoritmo que leia dois n�meros e apresente o resultado da opera��o de acordo com um menu, com 4 op��es:
 1) Somar os n�meros; 2) Subtrair os n�meros; 3) Multiplicar os n�meros; 4) Dividir os n�meros. 
 Leia a op��o do usu�rio e execute a opera��o e apresente o resultado. 
 Caso a op��o digitada seja inv�lida, apresente a mensagem de �Op��o inv�lida� para o usu�rio.   */

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, opcao, resultado = 0;

		System.out.print("Digite o primeiro n�mero: ");
		num1 = input.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		num2 = input.nextInt();
		
		System.out.println("Escolha uma op��o: ");
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
			System.out.println("Op��o inv�lida");
			
		}
		
		System.out.println("O resultado �: " + resultado);

	}
}