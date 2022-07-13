package dio;

public class Main {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.setNome("Diego");
		
		Conta cc = new ContaCorrente(diego);
		Conta poupanca = new ContaPoupanca(diego);
		
		cc.depositar(250);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
