package Atividade2;

public class Aluno extends Pessoa {

	private String serie;
	private Integer sala;
	private Double nota;

	public Aluno() {

	}

	public Aluno(String nome, Integer idade, String serie, Integer sala, Double nota) {
		this.nome = nome;
		this.idade = idade;
		this.serie = serie;
		this.sala = sala;
		this.nota = nota;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Integer getSala() {
		return sala;
	}

	public void setSala(Integer sala) {
		this.sala = sala;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Aluno[Nome =" + nome + "idade =" + idade + "serie=" + serie + ", sala=" + sala + ", nota=" + nota + "]";
	}

}
