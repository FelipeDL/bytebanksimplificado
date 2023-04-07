package bytebanksimplificado;
import java.util.*;

public class Autenticador {
	
	private String login;
	
	private int senha;
	
	private CadastroUsuario cadastro;
	
	
	public CadastroUsuario getCadastro() {
		return cadastro;
	}

	public void setCadastro(CadastroUsuario cadastro) {
		this.cadastro = cadastro;
	}

	public boolean autenticador(int senha, String login, CadastroUsuario cadastro) {
		
		

		if (cadastro.getLogin().equals(login) && cadastro.getSenha() == senha) {
			
		System.out.println("Autenticado");
		
		return true;
		} else {
			
			System.out.println("Falha de Autenticação");
			
			return false;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
