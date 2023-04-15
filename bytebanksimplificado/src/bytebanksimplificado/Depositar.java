package bytebanksimplificado;

import java.util.List;

// Classe usada para adicionar valor (depósito) na conta criada; - Resolvida.


import java.util.Scanner;

public class Depositar {
	
	private AberturaConta conta;
	
	private CadastroUsuario cadastro;
	
	private double valor;
	
	

	
	public AberturaConta getConta() {
		return conta;
	}

	public void setConta(AberturaConta conta) {
		this.conta = conta;
	}

	public CadastroUsuario getCadastro() {
		return cadastro;
	}

	public void setCadastro(CadastroUsuario cadastro) {
		this.cadastro = cadastro;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void depositar(List<AberturaConta> contasCadastradas) {
		
		Scanner leitorTeclado = new Scanner(System.in);
		
		System.out.println("Informe o NÚMERO DA CONTA: ");
		
		int numeroDaConta = leitorTeclado.nextInt();
		
		
		
		for (AberturaConta teste2 : contasCadastradas) {
			
			if(teste2.getNumeroDaConta() == numeroDaConta) {
				
				System.out.println("Informe o valor do DEPÓSITO: ");
				int valor = leitorTeclado.nextInt();
				double valor1 = teste2.getSaldoAbertura();
				
				teste2.setSaldoAbertura(valor + valor1);
			
				System.out.println("Depósito Realizado com Sucesso!");
				
			} else {
				
				System.out.println("Conta Inválida");
			}
			
		}
	
	
	
	
	
	
	

	
	}
}