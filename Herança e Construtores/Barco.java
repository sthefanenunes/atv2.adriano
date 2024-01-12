package Atividade2;

public class Barco extends Veiculo {
	private String tipoCasco;

	public Barco(String modelo, int ano, String tipoCasco) {
		super(modelo, ano);
		this.tipoCasco = tipoCasco;
	}

	public String getTipoCasco() {
		return tipoCasco;
	}

	public void setTipoCasco(String tipoCasco) {
		this.tipoCasco = tipoCasco;
	}

	@Override
	public String toString() {
		return "Barco [modelo=" + getModelo() + "ano=" + getAno() + "tipoCasco=" + tipoCasco + "]";
	}

}