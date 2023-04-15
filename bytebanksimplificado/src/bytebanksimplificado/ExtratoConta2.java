package bytebanksimplificado;
import java.util.*;
import bytebanksimplificado.AberturaConta;

public class ExtratoConta2 {
	
	private String login;
	
	private int senha;
	
	private CadastroUsuario cadastro;
	
	public  List<AberturaConta> contasCadastradas;
	
	private AberturaConta conta;
	
	
	public CadastroUsuario getCadastro() {
		return cadastro;
	}

	public void setCadastro(CadastroUsuario cadastro) {
		this.cadastro = cadastro;
	}


	public boolean autenticador(List<AberturaConta> contasCadastradas) {
		
		Scanner leitorTeclado = new Scanner(System.in);
		
		System.out.println("Digite seu Login: ");
		
		String l = leitorTeclado.next();
			
		System.out.println("Digite uma senha: ");
		
		int s = leitorTeclado.nextInt();
		
		
		for (AberturaConta teste2 : contasCadastradas) {
			
			if(teste2.getLogin().equals(l) && teste2.getSenha()== s) {
				
				System.out.println("Usuário autenticado");
				
				System.out.println("********* BYTE BANK *********");
				System.out.println("      Extrato da Conta");
				System.out.println("Tipo de Conta: " + teste2.getTipoDeConta());
				System.out.println("Número da Conta: " + teste2.getNumeroDaConta());
				System.out.println("Titular: " + teste2.getNome());
				System.out.println("Saldo da Conta: " + teste2.getSaldoAbertura());
						
				return true;
			}
			
		}
		System.out.println("Falha de autenticação: Verifique a senha/login");
		return false;
		
	}
			
			

	public List<AberturaConta> getContasCadastradas() {
		return contasCadastradas;
	}

	public void setContasCadastradas(List<AberturaConta> contasCadastradas) {
		this.contasCadastradas = contasCadastradas;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
