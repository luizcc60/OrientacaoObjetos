	/**
	 * Este pacote faz referência a conta do banco e ela é abstrata.
	 */
package interfaces;

	/**
	 * Documentação da classe Conta.
	 * 
	 * @author Noturno
	 *
	 */

public abstract class Conta implements InterfaceMetodos {
	/**
	* Documentação dos atributos da classe Conta.
	*/

	// ATRIBUTOS
	private String numero;
	private double saldo;
	private double limite;
	private Agencia agencia;

	// GETTERS E SETTERS
	/**
	 * Metodo acessor do atributo numero.
	 * 
	 * @return
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * Método modificador do atributo número.
	 * @param numero
	 */

	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * Método acessor do atributo saldo.
	 * @return
	 */

	public double getSaldo() {
		return saldo;
	
	}
	/**
	 * Método modificador do atributo saldo
	 * @param saldo
	 */

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * Método acessor do atributo limite.
	 * @return
	 */

	public double getLimite() {
		return limite;
	}
	/**
	 * Método modificador do atributo limite.
	 * @param limite
	 */

	public void setLimite(double limite) {
		this.limite = limite;
	}
	/**
	 * Método acessor do atributo Agencia.
	 * @return
	 */

	public Agencia getAgencia() {
		return agencia;
	}
	/**
	 * Método modificador do atributo Agencia.
	 * @param agencia
	 */

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

}
