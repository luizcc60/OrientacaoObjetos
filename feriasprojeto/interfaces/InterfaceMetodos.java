/**
* Este pacote faz referência a conta do banco e ela é abstrata.
*/
package interfaces;

/**
 * Criação da Interface do sistema do banco.
 * @author Noturno
 *
 */
public interface InterfaceMetodos {
	
	/**
	 * Método abstrato depositar.
	 * @param valor
	 */
	public abstract void depositar(double valor);
	/**
	 * Método abstrato sacar.
	 * @param valor
	 */
	public abstract void sacar(double valor);
	
	

}
