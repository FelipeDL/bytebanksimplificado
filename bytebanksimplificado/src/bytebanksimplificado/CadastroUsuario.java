package bytebanksimplificado;

import java.util.*;

public class CadastroUsuario {
	
	private String nome;
	
	private String login = "default";
	
	private int senha;
	
	public Autenticador getAutentica() {
		return autentica;
	}


	public void setAutentica(Autenticador autentica) {
		this.autentica = autentica;
	}


	private Autenticador autentica;
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public int getSenha() {
		return senha;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}


	public void cadastroUsuario (){
		
		Scanner leitorTeclado = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		
		String nome = leitorTeclado.nextLine();
		
		this.nome = nome;
		
		System.out.println("Crie um login:");
		
		String login = leitorTeclado.nextLine();
		
		this.login = login;
		
		System.out.println("Crie uma senha numérica: ");
		
		int senha = leitorTeclado.nextInt();
		
		this.senha = senha;
		
		System.out.println("********************************");
		
		System.out.println("Cliente cadastrado");
		
		
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
