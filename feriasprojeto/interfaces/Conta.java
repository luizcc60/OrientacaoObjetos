package interfaces;

public abstract class Conta implements InterfaceMetodos {
	
	//ATRIBUTOS
	private String numero;
	private double saldo;
	private double limite;
	private Agencia agencia;
	
	//GETTERS E SETTERS
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}	
		
}
