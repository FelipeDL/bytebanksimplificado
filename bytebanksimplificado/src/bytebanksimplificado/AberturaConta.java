package bytebanksimplificado;
import java.util.*;

public class AberturaConta extends Conta {
	
	private int numeroDaConta;
	
	private String tipoDeConta = "default";
	
	private double saldoAbertura;

	private CadastroUsuario cadastroUsuario;
	
	private AberturaConta abertura;
	
	public  List<AberturaConta> contasCadastradas;
	
	// Testa  para colocar o cadastro aqui
	
	private String nome;
	
	private String login = "default";
	
	private int senha;
	
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


	// Método origainal da classe
	public AberturaConta() {

		this.contasCadastradas = new ArrayList<>();
	}
	
	
	public void abrirConta() {
		
		Scanner leitorTeclado = new Scanner(System.in);
		Random random = new Random();
		AberturaConta abertura = new AberturaConta();
		
		// Métodos trazidoa das classe Cadastr para teste
		
		System.out.println("Tipo de Conta: Corrente/Poupança ");
		
		String tipo = leitorTeclado.nextLine();
		
		this.tipoDeConta = tipo.toLowerCase();
		
		System.out.println("Digite seu nome:");
		
		String nome = leitorTeclado.nextLine();
		
		abertura.setNome(nome.toUpperCase());
		
		this.nome = nome;
		
		System.out.println("Crie um login:");
		
		
		
		String login = leitorTeclado.nextLine();
		
		abertura.setLogin(login);
		
		this.login = login;
		
		System.out.println("Crie uma senha numérica: ");
		
		int senha = leitorTeclado.nextInt();
		
		abertura.setSenha(senha);
		
		
		this.senha = senha;
		
		
		// Métodos originais a partir daqui
		
		
		String tipo1 = "corrente";
		
		String tipo2 = "poupança";
		
		if(this.tipoDeConta.equals(tipo1)) {
			
			this.numeroDaConta = random.nextInt(1000);
			
			abertura.setNumeroDaConta(numeroDaConta);
			
			this.tipoDeConta = tipo1;
			
			abertura.setTipoDeConta(tipoDeConta);
			
			this.saldoAbertura = 50;
			
			abertura.setSaldoAbertura(saldoAbertura);
			
			abertura.setCadastroUsuario(cadastroUsuario);
			
			contasCadastradas.add(abertura);
			
			
			System.out.println("Conta Corrente aberta");
			
		} else if (this.tipoDeConta.equals(tipo2)){
			
			this.numeroDaConta = random.nextInt(1000);
			
			abertura.setNumeroDaConta(numeroDaConta);
			
			this.tipoDeConta = tipo2;
			
			abertura.setTipoDeConta(tipoDeConta);
			
			this.saldoAbertura = 50;
			
			abertura.setSaldoAbertura(saldoAbertura);
			
			abertura.setCadastroUsuario(cadastroUsuario);
			
			contasCadastradas.add(abertura);
			
			
			System.out.println("Conta Poupança aberta");
			
		} else {
			System.out.println("Tipo de Conta Inválido");
		}
		
		System.out.println("Cliente cadastrado");
		System.out.println("********************************");
			
		
	}


	public int getNumeroDaConta() {
		return numeroDaConta;
	}


	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}



	public String getTipoDeConta() {
		return tipoDeConta;
	}


	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
	
		


	public CadastroUsuario getCadastroUsuario() {
		return cadastroUsuario;
	}


	public void setCadastroUsuario(CadastroUsuario cadastroUsuario) {
		this.cadastroUsuario = cadastroUsuario;
	}


	public double getSaldoAbertura() {
		return saldoAbertura;
	}


	public void setSaldoAbertura(double saldoAbertura) {
		this.saldoAbertura = saldoAbertura;
	}
	
	

	@Override
	public String toString() {  
		
		
		return "Cliente: " + this.getNome();
	}


	public List<AberturaConta> getContasCadastradas() {
		return contasCadastradas;
	}


	public void setContasCadastradas(List<AberturaConta> contasCadastradas) {
		this.contasCadastradas = contasCadastradas;
	}


	public AberturaConta getAbertura() {
		return abertura;
	}


	public void setAbertura(AberturaConta abertura) {
		this.abertura = abertura;
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
}
