package bytebanksimplificado;

import java.util.*;

public class CadastroUsuario {
	
	private String nome;
	
	private String login = "default";
	
	private int senha;
	
	private AberturaConta abertura;
	
	public ExtratoConta2 getAutentica() {
		return autentica;
	}


	public void setAutentica(ExtratoConta2 autentica) {
		this.autentica = autentica;
	}


	private ExtratoConta2 autentica;
	

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
	
	

	public AberturaConta getAbertura() {
		return abertura;
	}


	public void setAbertura(AberturaConta abertura) {
		this.abertura = abertura;
	}


	public void cadastroUsuario (){
		
		Scanner leitorTeclado = new Scanner(System.in);
		
		CadastroUsuario cadastro = new CadastroUsuario();
		
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
