package Atividade2;

public class Conta {

	protected double saldo;

	public Conta(double saldoInicial) {
	        this.saldo = saldoInicial;
	    }

	public void sacar(double valor) throws LimiteSaqueExcedidoException {
		if (valor > saldo) {
			throw new LimiteSaqueExcedidoException("Saque não permitido. Saldo insuficiente.");
		}
		saldo -= valor;
		System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
	}

	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
	}

	public double getSaldo() {
		return saldo;
	}
}