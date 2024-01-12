package Atividade2;

public class Veiculo {
	
	private String modelo;
    private int ano;
    private String cor;

    public Veiculo(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }
    
    public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void mostrarDetalhes() {
		System.out.println("Detalhes do Veículo:");
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Cor: " + cor);
	}

	public void mostrarDetalhes(String proprietario) {
		mostrarDetalhes();
		System.out.println("Proprietário: " + proprietario);
	}
	
	public void mostrarDetalhes(String proprietario, double preco) {
		mostrarDetalhes(proprietario);
		System.out.println("Preço: " + preco);
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", ano=" + ano + "]";
	}
    
    
}
