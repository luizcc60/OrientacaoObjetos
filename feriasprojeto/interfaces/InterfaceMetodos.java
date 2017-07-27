/**
* Este pacote faz refer�ncia a conta do banco e ela � abstrata.
*/
package interfaces;

/**
 * Cria��o da Interface do sistema do banco.
 * @author Noturno
 *
 */
public interface InterfaceMetodos {
	
	/**
	 * M�todo abstrato depositar.
	 * @param valor
	 */
	public abstract void depositar(double valor);
	/**
	 * M�todo abstrato sacar.
	 * @param valor
	 */
	public abstract void sacar(double valor);
	
	

}
