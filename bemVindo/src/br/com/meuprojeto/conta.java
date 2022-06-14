package br.com.meuprojeto;

public class conta {
	String cliente;
	double saldo;
	
	void exibesaldo () {
		System.out.println(cliente + " Seu saldo é " + saldo );
	}
	
	void saque (double valor) {
		saldo = saldo - valor;
	}
	
	void deposito (double valorDeposito) {
		saldo += valorDeposito;
	}
	
	void transferenciaValor (conta destino, double valor) {
		this.saque(valor);
		destino.deposito(valor);
	}
}
