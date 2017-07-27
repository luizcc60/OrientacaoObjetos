/**
* Este pacote faz refer�ncia a conta do banco e ela � abstrata.
*/

package interfaces;
/**
 * Documenta��o dos atributos da classe ContaPoupanca.
 * @author Noturno
 *
 */

public class ContaPoupanca extends Conta {
	// ATRIBUTOS
	/**
	 * Documenta��o do atributo taxaJurosRendimento
	 */
	private double taxaJurosRendimento;

	// GETTERS E SETTERS
	/**
	 * M�todo acessor do atributo getTaxaJurosRendimento.
	 * @return
	 */
	public double getTaxaJurosRendimento() {
		return taxaJurosRendimento;
	}
	
	/**
	 * M�todo modificador do atributo getTaxaJurosRendimento.
	 * @param taxaJurosRendimento
	 */
	public void setTaxaJurosRendimento(double taxaJurosRendimento) {
		this.taxaJurosRendimento = taxaJurosRendimento;
	}

	// M�TODOS DA INTERFACE
	/**
	 * M�todo obrigat�rio originado da Interface deste pacote com intuito de depositar um valor desejado.
	 */
	@Override
	public void depositar(double valor) {

		this.setSaldo(this.getSaldo() + valor);
	}
	
	/**
	 * M�todo obrigat�rio originado da Interface deste pacote com intuito de sacar um valor desejado.
	 */
	@Override
	public void sacar(double valor) {

		this.setSaldo(this.getSaldo() - valor);
	}

}
