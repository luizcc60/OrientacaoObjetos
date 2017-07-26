package interfaces;

import java.util.Date;

public class GeradorExtrato {

	public void GeradorImprimeExtrato(Conta c) {
		Date agora = new Date();

		System.out.println("DATA DE CONSULTA: " + agora);
		System.out.println("SALDO ATUAL: " + c.getSaldo());
	}

}
