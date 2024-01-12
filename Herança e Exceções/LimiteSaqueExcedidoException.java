package Atividade2;

public class LimiteSaqueExcedidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public LimiteSaqueExcedidoException(String mensagem) {
		super(mensagem);
	}
}