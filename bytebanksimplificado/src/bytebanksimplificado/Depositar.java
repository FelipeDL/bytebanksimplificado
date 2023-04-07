package bytebanksimplificado;

import java.util.Scanner;

public class Depositar {
	
	private AberturaConta conta;
	
	private CadastroUsuario cadastro;
	
	private int valor;
	
	

	
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

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void depositar(AberturaConta conta) {
		
		Scanner leitorTeclado = new Scanner(System.in);
		
		System.out.println("Informe o NÚMERO DA CONTA: ");
		
		int numeroDaConta = leitorTeclado.nextInt();
		
		if(conta.getNumeroDaConta() == numeroDaConta) {
			
			System.out.println("Informe o valor do DEPÓSITO: ");
			int valor = leitorTeclado.nextInt();
			conta.setSaldo(valor);
			
			System.out.println("Depósito Realizado com Sucesso!");
		} else {
			
			System.out.println("Conta Inválida");
		}
		
	
	}
}
