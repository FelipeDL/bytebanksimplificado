package bytebanksimplificado;
import java.util.*;


public class ApresentacaoOpcoes {
	
	
	
//	private List<Conta> contasCadastradas;
	

	
	
	public void menuOpcoes() {
		
		Scanner leitorTeclado = new Scanner(System.in);
		
		
		AberturaConta abertura = new AberturaConta();
		

		int varLoop = 1;

		
		while(varLoop == 1) {
			
			int opcao;
			
			System.out.println(" Selecione uma das Opções");
			System.out.println(" [1] - Abertura de Conta");
			System.out.println(" [2] - Extrato");
			System.out.println(" [3] - Sacar");
			System.out.println(" [4] - Depositar");
			System.out.println(" [0] - Sair");
			
		


			
			opcao = leitorTeclado.nextInt();
			
			switch(opcao) {
			
			case 1:
	
				abertura.abrirConta();

				break;
				
			case 2:
		
				ExtratoConta2 teste = new ExtratoConta2();
				
				teste.autenticador(abertura.getContasCadastradas());

				
				break;
				
			case 3:
				
				Sacar sacar = new Sacar();
				
				sacar.sacar(abertura.getContasCadastradas());

				
				break;
				
			case 4:
				
				Depositar deposito = new Depositar();
				
				deposito.setConta(abertura);
				
				deposito.depositar(abertura.contasCadastradas);
				
				break;
			
			case 0:
				varLoop = 0;
				System.out.println("Programa Finalizado");
			
				
			}
			
			
			
			
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
