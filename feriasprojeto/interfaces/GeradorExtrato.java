/**
* Este pacote faz refer�ncia a conta do banco e ela � abstrata.
*/
package interfaces;

/**
 * Importando biblioteca date para determinar a data que foi gerado o saldo.
 */
import java.util.Date;

/**
 * Cria��o da classe respons�vel por gerar o Extrato universal.
 * @author Noturno
 *
 */
public class GeradorExtrato {
	
	/**
	 * M�todo modificador do Gerador de extrato.
	 * @param c
	 */
	public void GeradorImprimeExtrato(Conta c) {
	/**
	 * Criando uma nova data referente a biblioteca Date.
	 */
		Date agora = new Date();
		
	/**
	 * Imprimir para o usu�rio o extrato e a data.
	 */

		System.out.println("DATA DE CONSULTA: " + agora);
		System.out.println("SALDO ATUAL: " + c.getSaldo());
	}

}
