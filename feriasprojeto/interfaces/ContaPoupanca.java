/**
* Este pacote faz referência a conta do banco e ela é abstrata.
*/

package interfaces;
/**
 * Documentação dos atributos da classe ContaPoupanca.
 * @author Noturno
 *
 */

public class ContaPoupanca extends Conta {
	// ATRIBUTOS
	/**
	 * Documentação do atributo taxaJurosRendimento
	 */
	private double taxaJurosRendimento;

	// GETTERS E SETTERS
	/**
	 * Método acessor do atributo getTaxaJurosRendimento.
	 * @return
	 */
	public double getTaxaJurosRendimento() {
		return taxaJurosRendimento;
	}
	
	/**
	 * Método modificador do atributo getTaxaJurosRendimento.
	 * @param taxaJurosRendimento
	 */
	public void setTaxaJurosRendimento(double taxaJurosRendimento) {
		this.taxaJurosRendimento = taxaJurosRendimento;
	}

	// MÉTODOS DA INTERFACE
	/**
	 * Método obrigatório originado da Interface deste pacote com intuito de depositar um valor desejado.
	 */
	@Override
	public void depositar(double valor) {

		this.setSaldo(this.getSaldo() + valor);
	}
	
	/**
	 * Método obrigatório originado da Interface deste pacote com intuito de sacar um valor desejado.
	 */
	@Override
	public void sacar(double valor) {

		this.setSaldo(this.getSaldo() - valor);
	}

}
