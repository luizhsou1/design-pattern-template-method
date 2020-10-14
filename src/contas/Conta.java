package contas;

import java.util.Scanner;

public abstract class Conta {
	Conta() {}
	
    public final void abrirConta() {
    	cadastrarPessoaFisica();
    	validarPessoaFisicaSPC();
    	depositarValorInicial();
    	configurarLimite();
    	cadastrarSenha();
    	solicitarCartaoCredito();
    	finalizar();
    }

	public void cadastrarPessoaFisica() {
		System.out.println("Cadastrado Pessoa f�sica");
	}

	public void validarPessoaFisicaSPC() {
		System.out.println("Pessoa f�sica validada no SPC");
	}

	public void depositarValorInicial() {
		System.out.println("Depositado valor inicial");
	}
	
	public void cadastrarSenha() {
		System.out.println("Senha cadastrada");
	}
    
	public void solicitarCartaoCredito() {}
    public void configurarLimite(){ }
   
    public abstract void finalizar();
    
}
