package Atividade2;

public class Circulo extends Figura {

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}

}
