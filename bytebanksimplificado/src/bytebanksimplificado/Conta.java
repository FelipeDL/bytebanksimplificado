package bytebanksimplificado;

// não se pode mais instanciar objetos dessa classe, pq é abstrata.

public abstract class Conta {
	
	private double saldo;
	
	private int numeroDaConta = 0;
	
	private String tipoDeConta;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
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
	
	

	

	

}
