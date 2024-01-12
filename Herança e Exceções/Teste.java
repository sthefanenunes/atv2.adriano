package Atividade2;

public class Teste {

	public static void main(String[] args) {
        try {
              ContaCorrente contaCorrente = new ContaCorrente(5000, 3000);

           
            contaCorrente.sacar(2000); 
            contaCorrente.depositar(1000);
            contaCorrente.sacar(4000); 
            contaCorrente.sacar(5000); 

        } catch (LimiteSaqueExcedidoException e) {
            System.out.println("Exceção: " + e.getMessage());
        }
    }
}