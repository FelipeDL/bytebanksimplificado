package bytebanksimplificado;
import java.util.*;

public class AberturaConta extends Conta {
	
	private int numeroDaConta;
	
	private String tipo1 = "Corrente";
	
	private String tipo2 = "Poupança";

	private String tipoDeConta;
	
	private double saldo;
	
	
	public void abrirConta() {
		
		Scanner leitorTeclado = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Tipo de Conta: ");
		
		this.tipoDeConta = leitorTeclado.nextLine();
		
		if(this.tipoDeConta.equals(tipo1)) {
			
			this.numeroDaConta = random.nextInt(1000);
			
			this.tipoDeConta = this.tipo1;
			
			this.saldo = 0;
			
			System.out.println("Conta Corrente aberta");
			
		} else if (this.tipoDeConta.equals(tipo2)){
			
			this.numeroDaConta = random.nextInt(1000);
			
			this.tipoDeConta = this.tipo2;
			
			this.saldo = 0;
			
			System.out.println("Conta Poupança aberta");
			
		} else {
			System.out.println("Tipo de Conta Inválido");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


	public int getNumeroDaConta() {
		return numeroDaConta;
	}


	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}


	public String getTipo1() {
		return tipo1;
	}


	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}


	public String getTipo2() {
		return tipo2;
	}


	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}


	public String getTipoDeConta() {
		return tipoDeConta;
	}


	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
