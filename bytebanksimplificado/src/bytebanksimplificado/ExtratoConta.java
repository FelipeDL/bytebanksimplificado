package bytebanksimplificado;

import java.util.*;

public class ExtratoConta {
	
	private CadastroUsuario cadastro;
	
	private AberturaConta abertura;
	
	private int senha;
	
	private String login;
	
	
	
	public CadastroUsuario getCadastro() {
		return cadastro;
	}

	public void setCadastro(CadastroUsuario cadastro) {
		this.cadastro = cadastro;
	}
	
	
	public AberturaConta getAbertura() {
		return abertura;
	}

	public void setAbertura(AberturaConta abertura) {
		this.abertura = abertura;
	}
	
	public boolean extrato(int senha, String login) {
		
		Scanner leitorTeclado = new Scanner(System.in);
		
		System.out.println("Login: ");
		this.login = leitorTeclado.nextLine();
		
		System.out.println("Senha: ");
		this.senha = leitorTeclado.nextInt();
		
		Autenticador a = new Autenticador();
		
		
		if(a.autenticador(this.senha, this.login, cadastro)) {
			
			System.out.println("********* BYTE BANK *********");
			System.out.println("      Extrato da Conta");
			System.out.println("Tipo de Conta: " + abertura.getTipoDeConta());
			System.out.println("Número da Conta: " + abertura.getNumeroDaConta());
			System.out.println("Titular: " + cadastro.getNome());
			System.out.println("Saldo da Conta: " + abertura.getSaldo());
			
			return true;
			
		} else {
			
			return false;
		}
		
		
		
	}


	

}
