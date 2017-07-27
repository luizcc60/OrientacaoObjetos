/**
 * Este pacote faz refer�ncia a conta do banco.
 */

package interfaces;

/**
 * Documenta��o da Classe Ag�ncia.
 * @author Noturno
 *
 */

public class Agencia {
	
	/**
	 * Documenta��o do atributo numero.
	 */
	
	private String numero;
	
	/**
	 * Este � o m�todo acessor do atributo n�mero.
	 * @return
	 */

	public String getNumero() {
		return numero;
	}
	/**
	 * Este � o m�todo modificador do atributo numero.
	 * @param numero
	 */

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
