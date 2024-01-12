package Atividade2;

public class Estudante extends Pessoa {

	private int matricula;

	public Estudante() {
		super();
		this.matricula = 0;
	}

	public Estudante(String nome, int idade, int matricula) {
		super(nome, idade);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Estudante [Nome="+getNome()+" idade="+getIdade()+" matricula=" + matricula + "]";
	}
	
	
}