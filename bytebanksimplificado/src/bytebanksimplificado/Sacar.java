package bytebanksimplificado;

import java.util.Scanner;

public class Sacar {
	
	private CadastroUsuario cadastro;
	
	private AberturaConta conta;
	
	private int senha;
	
	private String login;
	

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


	public boolean sacar(String login, int senha) {
		
		Scanner leitorTeclado = new Scanner(System.in);
			
		System.out.println("Login: ");
		
		this.login = leitorTeclado.nextLine();
			
		System.out.println("Senha: ");
		this.senha = leitorTeclado.nextInt();
			
		Autenticador a = new Autenticador();
			
		if(a.autenticador(senha, login, cadastro)) {
			System.out.println("Digite o valor que deseja SACAR: ");
			int valor = leitorTeclado.nextInt();			
			if(conta.getSaldo() >= valor) {
				
				double saldo = conta.getSaldo();
				
				conta.setSaldo(saldo - valor);
				
				System.out.println("Saque realizado com sucesso");
				
			} else {
				System.out.println("Saldo insuficiente");
			}
			
				return true;
				
		} else {
				return false;
			}	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
