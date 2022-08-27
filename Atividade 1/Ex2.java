/*3)  Declare uma variável para armazenar o salário de uma pessoa e imprima na tela o valor do salário acrescido de 10%.*/
public class Ex3 {

	public static void main(String[] args) {
	        double salario = 1500.0;
                int taxa = 10; // 10% de acréscimo
                double acrescimo = salario * 10 / 100;// cálculo de 10% em cima do salário
		double total = salario + acrescimo;

		System.out.println("Salário total:" + total);
	}

}