package dio;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("*** EXTRATO Conta Corrente ***" );
		imprimirInfosComuns();
		
		
	}	
}
