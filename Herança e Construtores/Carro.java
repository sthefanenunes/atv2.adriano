package Atividade2;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String modelo, int ano, int numeroPortas) {
        super(modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

	@Override
	public String toString() {
		return "Carro [modelo=" + getModelo() + "ano=" + getAno() + "numeroPortas=" + numeroPortas + "]";
	}
    
    
}