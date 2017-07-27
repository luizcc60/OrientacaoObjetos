	/**
	* Este pacote faz referência a conta do banco e ela é abstrata.
	*/

package interfaces;
	/**
	 * Documentação dos atributos da classe ContaCorrente.
	 * @author Noturno
	 *
	 */

public class ContaCorrente extends Conta {
	
	/**
	 * Documentação dos atributos desta classe.
	 */
	//ATRIBUTOS
	private double limite;
	
	
	//GETTERS E SETTERS
	
	
	/**
	 * Método acessor do atributo limite.
	 */
	public double getLimite() {
		return limite;
	}
	
	/**
	 * Método modificador do atributo limite.
	 */

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//MÉTODOS DA INTERFACE
	/**
	 * Método obrigatório originado da Interface deste pacote com intuito de depositar um valor desejado.
	 */
	@Override
	public void depositar(double valor) {	
		
		this.setSaldo(this.getSaldo() + valor);
		
		if(valor <= 0) {
			IllegalArgumentException erro = new IllegalArgumentException ();
			throw erro;}

	}
	
	/**
	 * Método obrigatório originado da Interface deste pacote com intuito de sacar um valor desejado.
	 */

	@Override
	public void sacar(double valor) {
	
		this.setSaldo(this.getSaldo() - valor);
	}

	

}
