package br.com.meuprojeto;

public class contateste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conta cleube = new conta();
		cleube.cliente = "Cléube";
		cleube.saldo = 154.20;
		cleube.exibesaldo();
		cleube.saque(44.20);
		cleube.exibesaldo();
		cleube.deposito(100.00);
		cleube.exibesaldo();
		conta conta = new conta();
		conta.cliente = "Pedro";
		conta.saldo = 100.00;
		conta.exibesaldo();
		conta.transferenciaValor(cleube, 100);
		conta.exibesaldo();
		cleube.exibesaldo();
		cleube.transferenciaValor(conta, 200);
		cleube.exibesaldo();
		conta.exibesaldo();
	}

}
