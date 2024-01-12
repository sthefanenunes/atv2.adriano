package Atividade2;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Raimundito", 60);
		
		Aluno a1 = new Aluno("Serginho", 15, "6ªSérie", 20, 7.5);
		
		Professor pro1 = new Professor("Albiere", 69, "Biologia", "Ensino médio", 30);
		
		System.out.println(p1);
		System.out.println(a1);
		System.out.println(pro1);
	}

}
