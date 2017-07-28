package collectionsJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import interfaces.Agencia;
import interfaces.ContaCorrente;
import interfaces.ContaPoupanca;

public class TesteLista {
	public static void main(String[] args) {

		Agencia ag = new Agencia();
		ag.setNumero("256");

		Agencia ag2 = new Agencia();
		ag.setNumero("251");
		ContaCorrente cc = new ContaCorrente();

		cc.setAgencia(ag);
		cc.setLimite(500);
		cc.setNumero("2595-8587-5852-6985");
		cc.setSaldo(5000);

		List<ContaCorrente> lContas = new ArrayList<>();
		lContas.add(cc);

		ContaPoupanca cp = new ContaPoupanca();
		cc.setAgencia(ag2);
		cc.setLimite(500);
		cc.setNumero("2598-8525-6352-8522");
		cc.setSaldo(1500);

		List<ContaPoupanca> lContas2 = new ArrayList<>();
		lContas2.add(cp);
		
		
		int quantidade = lContas.size();
		System.out.println(quantidade);
		
		int quantidade2 = lContas.size();
		System.out.println(quantidade2);
		
		//Corrente
		lContas.remove(ag);
		
		int indice = lContas.indexOf(cc.getNumero());
		System.out.println(indice);
		
		
		//Poupança
		lContas2.remove(cc.getSaldo());
		
		int indice2 = lContas2.indexOf(ag2);
		
		for (ContaPoupanca contaPoupanca : lContas2) {
			
			System.out.println(contaPoupanca);
			
		}
		
		for (ContaCorrente contaCorrente : lContas) {
			
			System.out.println(contaCorrente);
			
			lContas.clear();
			lContas2.clear();
			
		}
	}

}
