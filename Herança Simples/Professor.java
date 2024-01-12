package Atividade2;

public class Professor extends Pessoa {

	private String disciplina;
	private String nivelEnsino;
	private int anosExperiencia;

	public Professor() {

	}

	public Professor(String nome, Integer idade, String disciplina, String nivelEnsino, int anosExperiencia) {
		this.nome = nome;
		this.idade = idade;
		this.disciplina = disciplina;
		this.nivelEnsino = nivelEnsino;
		this.anosExperiencia = anosExperiencia;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getNivelEnsino() {
		return nivelEnsino;
	}

	public void setNivelEnsino(String nivelEnsino) {
		this.nivelEnsino = nivelEnsino;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}

	@Override
	public String toString() {
		return "Professor[Nome =" + nome + "idade =" + idade + "disciplina=" + disciplina + ", nivelEnsino="
				+ nivelEnsino + ", anosExperiencia=" + anosExperiencia + "]";
	}

}
