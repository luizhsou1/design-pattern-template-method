package contas;

import java.util.Scanner;

public class ContaCorrente extends Conta {
	public void configurarLimite() {
		System.out.println("Limite configurado para a Conta Corrente");
	}
	
	public void solicitarCartaoCredito() {
		System.out.println("DESEJA SOLICITAR CARTÃO DE CRÉDITO?");
    	try (Scanner input = new Scanner(System.in)) {
			String desejaCartaoDeCredito = input.nextLine();
			if (desejaCartaoDeCredito.toUpperCase() == "S") {
				System.out.println("Cartão de crédito solicitado");
			} else {
				System.out.println("Cartão de crédito não solicitado");
			}
		}
	}
	
	public void finalizar(){
		System.out.println("Conta Corrente aberta!");
	 }
}
