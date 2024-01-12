package Atividade2;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String modelo, int ano,String cor,int numeroPortas) {
        super(modelo, ano, cor);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
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
		return "Carro [modelo=" + getModelo() + "ano=" + getAno() + "numeroPortas=" + numeroPortas + "]";
	}
    
    
}