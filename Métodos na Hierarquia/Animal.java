package Atividade2;

public class Animal {
	protected String nome;
	protected String especie;
	
	public Animal() {
		
	}

	public Animal(String nome, String especie) {
		super();
		this.nome = nome;
		this.especie = especie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", especie=" + especie + "]";
	}
	
	public void som() {}
}
