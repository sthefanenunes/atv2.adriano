package Atividade2;

public class Cachorro extends Animal {

	public Cachorro(String nome, String especie) {
		this.nome = nome;
		this.especie = especie;
	}
	
	@Override
	public void som() {
		System.out.println("Au-Au");
	}
}
