package interfaces;

public class Teste {
	
	public static void main(String[] args) {
		
		ContaCorrente corrente = new ContaCorrente();
		Agencia agencia = new Agencia();
		GeradorExtrato gerador = new GeradorExtrato();
		agencia.setNumero("2512");
		
		corrente.setAgencia(agencia);
		corrente.setNumero("1254-8525-3256-5825");
		corrente.setSaldo(1500d);
		corrente.setLimite(500d);
		corrente.depositar(250);
		corrente.sacar(200);
		
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.setAgencia(agencia);
		poupanca.setNumero("2589-5289-9686-5848");
		poupanca.setSaldo(2500d);
		poupanca.setLimite(500d);
		poupanca.depositar(150);
		poupanca.sacar(500);
		
		gerador.GeradorImprimeExtrato(corrente);
		System.out.println("-------------------");
		gerador.GeradorImprimeExtrato(poupanca);
		
		
	}

}
