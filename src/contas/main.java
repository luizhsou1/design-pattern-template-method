package contas;

public class main {

	public static void main(String[] args) {
		System.out.println("** Conta Poupança **");
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.abrirConta();
		System.out.println("-------------------------");
		 
		System.out.println("");
		 
		System.out.println("** Conta Corrente **");
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.abrirConta();
		System.out.println("-------------------------");
	}

}
