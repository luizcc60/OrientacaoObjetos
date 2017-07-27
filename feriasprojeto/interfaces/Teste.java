/**
* Este pacote faz referência a conta do banco e ela é abstrata.
*/
package interfaces;
/**
 * Classe teste para criação dos objetos.
 * @author Noturno
 *
 */

public class Teste {
	
	/**
	 * Objeto main para criar os objetos.
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Criando uma conta corrente.
		 */
		ContaCorrente corrente = new ContaCorrente();
		/**
		 * Criando uma agencia.
		 */
		Agencia agencia = new Agencia();
		/**
		 * chamando o gerador de extrato universal para uso.
		 */
		GeradorExtrato gerador = new GeradorExtrato();
		/**
		 * Determinando valor a primeira agência criada.
		 */
		agencia.setNumero("2512");
		
		/**
		 * Atribuindo valor aos atributos na criação do objeto.
		 */
		corrente.setAgencia(agencia);
		corrente.setNumero("1254-8525-3256-5825");
		corrente.setSaldo(1500d);
		corrente.setLimite(500d);
		
		//MÉTODO DEPOSITAR COM MENSAGEM DE ERRO CASO FUJA DOS PARAMÊTROS ESTABELECIDOS NA CLASSE ContaCorrente.
		try {
		     corrente.depositar(250);
		} catch (IllegalArgumentException e) {
		     System.out.println ("Houve um erro ao depositar");
		}
		corrente.sacar(200);
		
		/**
		 * Criando uma conta poupança.		
		 */
		ContaPoupanca poupanca = new ContaPoupanca();
		/**
		 * Atribuindo valor aos atributos na criação do objeto
		 */
		poupanca.setAgencia(agencia);
		poupanca.setNumero("2589-5289-9686-5848");
		poupanca.setSaldo(2500d);
		poupanca.setLimite(500d);
		poupanca.depositar(150);
		poupanca.sacar(500);
		
		/**
		 * Utilizando o gerador de extrato para conta corrente criada e a conta poupança criada.		
		 */
		gerador.GeradorImprimeExtrato(corrente);
		System.out.println("-------------------");
		gerador.GeradorImprimeExtrato(poupanca);
		
		

		
		
	}

}
