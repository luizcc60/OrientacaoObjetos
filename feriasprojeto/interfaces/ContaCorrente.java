	/**
	* Este pacote faz refer�ncia a conta do banco e ela � abstrata.
	*/

package interfaces;
	/**
	 * Documenta��o dos atributos da classe ContaCorrente.
	 * @author Noturno
	 *
	 */

public class ContaCorrente extends Conta {
	
	/**
	 * Documenta��o dos atributos desta classe.
	 */
	//ATRIBUTOS
	private double limite;
	
	
	//GETTERS E SETTERS
	
	
	/**
	 * M�todo acessor do atributo limite.
	 */
	public double getLimite() {
		return limite;
	}
	
	/**
	 * M�todo modificador do atributo limite.
	 */

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//M�TODOS DA INTERFACE
	/**
	 * M�todo obrigat�rio originado da Interface deste pacote com intuito de depositar um valor desejado.
	 */
	@Override
	public void depositar(double valor) {	
		
		this.setSaldo(this.getSaldo() + valor);
		
		if(valor <= 0) {
			IllegalArgumentException erro = new IllegalArgumentException ();
			throw erro;}

	}
	
	/**
	 * M�todo obrigat�rio originado da Interface deste pacote com intuito de sacar um valor desejado.
	 */

	@Override
	public void sacar(double valor) {
	
		this.setSaldo(this.getSaldo() - valor);
	}

	

}
