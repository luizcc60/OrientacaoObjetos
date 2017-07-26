package interfaces;

public class ContaPoupanca extends Conta {
	//ATRIBUTOS
	private double taxaJurosRendimento;
	
	//GETTERS E SETTERS	
	public double getTaxaJurosRendimento() {
		return taxaJurosRendimento;
	}

	public void setTaxaJurosRendimento(double taxaJurosRendimento) {
		this.taxaJurosRendimento = taxaJurosRendimento;
	}
	
	
	//MÉTODOS DA INTERFACE
	@Override
	public void depositar(double valor) {	
		
		this.setSaldo(+valor);
	}

	@Override
	public void sacar(double valor) {
	
		this.setSaldo(-valor);
	}

}
