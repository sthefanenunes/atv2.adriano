package Atividade2;

public class Gato extends Animal {

	Animal animal;
	
	
	
	public Gato(String nome, String especie) {
		this.nome = nome;
		this.especie = especie;
	}



	@Override
	public void som() {
		System.out.println("Miau");
	}
	
}
