	/**
	 * Este pacote faz refer�ncia a conta do banco e ela � abstrata.
	 */
package interfaces;

	/**
	 * Documenta��o da classe Conta.
	 * 
	 * @author Noturno
	 *
	 */

public abstract class Conta implements InterfaceMetodos {
	/**
	* Documenta��o dos atributos da classe Conta.
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
	 * M�todo modificador do atributo n�mero.
	 * @param numero
	 */

	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * M�todo acessor do atributo saldo.
	 * @return
	 */

	public double getSaldo() {
		return saldo;
	
	}
	/**
	 * M�todo modificador do atributo saldo
	 * @param saldo
	 */

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * M�todo acessor do atributo limite.
	 * @return
	 */

	public double getLimite() {
		return limite;
	}
	/**
	 * M�todo modificador do atributo limite.
	 * @param limite
	 */

	public void setLimite(double limite) {
		this.limite = limite;
	}
	/**
	 * M�todo acessor do atributo Agencia.
	 * @return
	 */

	public Agencia getAgencia() {
		return agencia;
	}
	/**
	 * M�todo modificador do atributo Agencia.
	 * @param agencia
	 */

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

}
