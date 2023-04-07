package bytebanksimplificado;
import java.util.*;


public class ApresentacaoOpcoes {
	
	
	
	
	
	
	public void menuOpcoes() {
		
		Scanner leitorTeclado = new Scanner(System.in);
		
		CadastroUsuario cadastro = new CadastroUsuario();
		
		ExtratoConta extratoCadastro = new ExtratoConta();
		
		Autenticador autenticaCadastro = new Autenticador();
		
		AberturaConta abertura = new AberturaConta();
		
		
		
		
		String login;
		String nome;
		int senha;
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
				
				cadastro.cadastroUsuario();
				
				abertura.abrirConta();
			
				
			
			
		
				break;
				
			case 2:
				
				ExtratoConta extratoCad = new ExtratoConta();
				
				extratoCad.setCadastro(cadastro);
				extratoCad.setAbertura(abertura);
				
				extratoCad.extrato(extratoCad.getCadastro().getSenha(), extratoCad.getCadastro().getLogin());				
				break;
				
			case 3:
				
				Sacar sacar = new Sacar();
				sacar.setConta(abertura);
				sacar.setCadastro(cadastro);
				
				sacar.sacar(sacar.getCadastro().getLogin(), sacar.getCadastro().getSenha());
				break;
				
			case 4:
				
				Depositar deposito = new Depositar();
				
				deposito.setConta(abertura);
				
				deposito.depositar(abertura);
				
				break;
			
			case 0:
				varLoop = 0;
				System.out.println("Programa Finalizado");
				
			
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
