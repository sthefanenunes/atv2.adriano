package Atividade2;

public class Barco extends Veiculo {
	private String tipoCasco;

	public Barco(String modelo, int ano,String cor, String tipoCasco) {
		super(modelo, ano, cor);
		this.tipoCasco = tipoCasco;
	}

	public String getTipoCasco() {
		return tipoCasco;
	}

	public void setTipoCasco(String tipoCasco) {
		this.tipoCasco = tipoCasco;
	}
	
	@Override
	public void mostrarDetalhes() {
		System.out.println("Detalhes do Veículo:");
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ano: " + getAno());
		System.out.println("Cor: " + getCor());
	}
	
	@Override
	public void mostrarDetalhes(String proprietario) {
		mostrarDetalhes();
		System.out.println("Proprietário: " + proprietario);
	}
	
	@Override
	public void mostrarDetalhes(String proprietario, double preco) {
		mostrarDetalhes(proprietario);
		System.out.println("Preço: " + preco);
	}

	@Override
	public String toString() {
		return "Barco [modelo=" + getModelo() + "ano=" + getAno() + "tipoCasco=" + tipoCasco + "]";
	}

}