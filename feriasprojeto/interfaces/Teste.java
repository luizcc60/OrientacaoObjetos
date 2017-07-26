package interfaces;

public class Teste {
	
	public static void main(String[] args) {
		
		ContaCorrente corrente = new ContaCorrente();
		Agencia agencia = new Agencia();
		agencia.setNumero("2512");
		
		corrente.setAgencia(agencia);
		corrente.setNumero("1254-8525-3256-5825");
		corrente.setSaldo(1500d);
		corrente.setLimite(500d);
		corrente.depositar(250);
		corrente.sacar(200);
		
		
		System.out.println("Agência: "+corrente.getAgencia().getNumero()+"\n"+"Número cartão: "+corrente.getNumero()+"\n"+"Saldo: "+corrente.getSaldo()+"\n"+"Limite: "+corrente.getLimite());
	}

}
