package Atividade2;

public class Retangulo extends Figura {
	private double comprimento;
	private double largura;

	public Retangulo(double comprimento, double largura) {
		this.comprimento = comprimento;
		this.largura = largura;
	}

	@Override
	public double calcularArea() {
		return comprimento * largura;
	}

	@Override
	public String toString() {
		return "Retangulo [comprimento=" + comprimento + ", largura=" + largura + "]";
	}

}