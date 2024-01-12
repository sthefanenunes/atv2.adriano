package Atividade2;

public class ContaCorrente extends Conta {

	private double limiteSaque;

	public ContaCorrente(double saldoInicial, double limiteSaque) {
		super(saldoInicial);
		this.limiteSaque = limiteSaque;
	}

	@Override
	public void sacar(double valor) throws LimiteSaqueExcedidoException {
		if (valor > (saldo + limiteSaque)) {
			throw new LimiteSaqueExcedidoException(
					"Limite de saque excedido. Saldo disponível com limite: " + (saldo + limiteSaque));
		}
		saldo -= valor;
		System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
	}
}