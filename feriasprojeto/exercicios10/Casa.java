package exercicios10;

public class Casa {
	// ATRIBUTOS
	private CorPinta cor;
	private boolean porta1;
	private boolean porta2;
	private boolean porta3;

	// GETTERS E SETTERS
	public CorPinta getCor() {
		return cor;
	}

	public void setCor(CorPinta cor) {
		this.cor = cor;
	}

	public boolean isPorta1() {
		return porta1;
	}

	public void setPorta1(boolean porta1) {
		this.porta1 = porta1;
	}

	public boolean isPorta2() {
		return porta2;
	}

	public void setPorta2(boolean porta2) {
		this.porta2 = porta2;
	}

	public boolean isPorta3() {
		return porta3;
	}

	public void setPorta3(boolean porta3) {
		this.porta3 = porta3;
	}

	// METODO ESPECIAL

	public int quantasPortasEstaoAbertas() {
		int qtdPortasAbertas = 0;

		if (this.porta1 == true) {
			qtdPortasAbertas++;
		}
		if (this.porta2 == true) {
			qtdPortasAbertas++;
		}
		if (this.porta3 == true) {
			qtdPortasAbertas++;
		}
		return qtdPortasAbertas;
	}

	public int totalDePortas() {
		int totalPortas = 0;

		if (this.isPorta1()) {
			totalPortas++;
		} else {
			totalPortas++;
		}
		if (this.isPorta2()) {
			totalPortas++;
		} else {
			totalPortas++;
		}

		if (this.isPorta3()) {
			totalPortas++;
		} else {
			totalPortas++;
		}
		return totalPortas;

		

}

}
