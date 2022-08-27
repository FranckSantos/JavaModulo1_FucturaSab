package contas;

public class Poupanca extends ContaCorrente {

	public Poupanca() {

	}

	public Poupanca(String nome, int numero) {
		setTitular(nome);
		setNumConta(numero);
	}

	public void resgatar(double valor, ContaCorrente destino) {
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor); 
			destino.depositar(valor);

		} else {
			System.out.println("saldo insuficiente: Saldo atual: " + getSaldo());
		}
	}

	@Override
	public void mostrarSaldo() {
		System.out.println("Saldo atual da Poupan�a: " + getSaldo());
	}

	@Override
	public void dadosDaConta() {
		System.out.println("+-------------------------------+");
		System.out.println("| Titular Poupan�a: " + getTitular());
		System.out.println("| Numero da Conta Poupan�a: " + getNumConta() + "-1");
		System.out.println("| Saldo atual: " + getSaldo());
		System.out.println("+-------------------------------+\n");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Override
//	public String toString() {
//		return "Numero Conta Poupan�a: " 
//			+ numConta 
//			+ ", Titular: " 
//			+ titular 
//			+ ", Saldo: " 
//			//+ saldo;
//			+String.format("%.2f", saldo);
//	}

}
