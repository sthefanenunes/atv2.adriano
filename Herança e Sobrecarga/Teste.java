package Atividade2;

public class Teste {

	public static void main(String[] args) {

		Veiculo v1 = new Veiculo("Moto", 1980, "preto");

		Carro c1 = new Carro("Fusca", 1985,"Preto", 2);

		Barco b1 = new Barco("Predador", 1974,"Bege","Fibra de vidro");

		v1.mostrarDetalhes("Creovaldo", 50000.00);
		c1.mostrarDetalhes("Serafião Rubicó", 100000.00);
		b1.mostrarDetalhes("Nerdelici", 100000.00);
	}

}
