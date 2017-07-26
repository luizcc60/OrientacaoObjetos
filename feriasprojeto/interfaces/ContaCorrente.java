package interfaces;

public class ContaCorrente extends Conta {
	//ATRIBUTOS
	private double limite;

	
	//GETTERS E SETTERS
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//MÉTODOS DA INTERFACE
	@Override
	public void depositar(double valor) {	
		
		this.setSaldo(this.getSaldo() + valor);
	}

	@Override
	public void sacar(double valor) {
	
		this.setSaldo(this.getSaldo() - valor);
	}

	

}
