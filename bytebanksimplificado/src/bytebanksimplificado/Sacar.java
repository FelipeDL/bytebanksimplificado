package bytebanksimplificado;

import java.util.List;

// Classe para realizar uma retirada do saldoAbertura; Resolvido.

import java.util.Scanner;

public class Sacar {
	
	
	private List<AberturaConta> cadastro;
	
	private int senha;
	
	private String login;
	

	public boolean sacar(List<AberturaConta> contasCadastradas) {
		
		Scanner leitorTeclado = new Scanner(System.in);
	
		System.out.println("Digite seu Login: ");
		
		String l = leitorTeclado.next();
		
		System.out.println("Digite uma senha: ");
		int s = leitorTeclado.nextInt();
		
		for (AberturaConta teste2 : contasCadastradas) {
			
			if(teste2.getLogin().equals(l) && teste2.getSenha() == s) {
				
				System.out.println("Digite o valor que deseja SACAR: ");
				double valor = leitorTeclado.nextDouble();			
				if(teste2.getSaldoAbertura() >= valor) {
					
					double saldo = teste2.getSaldoAbertura();
					
					teste2.setSaldoAbertura(saldo - valor);
					
					System.out.println("Saque realizado com sucesso");
					
					
				} else {
					System.out.println("Saldo insuficiente");
				}
			
				return true;
			} else {
				
				
			}
				
			
		}
		System.out.println("Falha de autenticação: Verifique a senha/login");
		
		return false;
		
	}
	
	
	
	
	
	
	

}
