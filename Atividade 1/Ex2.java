/*3)  Declare uma vari�vel para armazenar o sal�rio de uma pessoa e imprima na tela o valor do sal�rio acrescido de 10%.*/
public class Ex3 {

	public static void main(String[] args) {
	        double salario = 1500.0;
                int taxa = 10; // 10% de acr�scimo
                double acrescimo = salario * 10 / 100;// c�lculo de 10% em cima do sal�rio
		double total = salario + acrescimo;

		System.out.println("Sal�rio total:" + total);
	}

}