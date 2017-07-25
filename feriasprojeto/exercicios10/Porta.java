package exercicios10;

public class Porta {

	// ATRIBUTOS
	private boolean aberta;
	private CorPinta cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	private static int portasAbertas = 0;

	public static int getPortasAbertas() {
		return portasAbertas;
	}

	public static void setPortasAbertas(int portasAbertas) {
		Porta.portasAbertas = portasAbertas;
	}

	// GETTERS E SETTERS
	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public CorPinta getCor() {
		return cor;
	}

	public void setCor(CorPinta cor) {
		this.cor = cor;
	}

	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public double getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

	// MÉTODOS
	public void abre() {
		if (!aberta) {
			portasAbertas++;
			aberta = true;
		}
	}

	public void fecha() {
		if (aberta) {
			portasAbertas--;
			aberta = false;
		}
	}

	public void pinta(CorPinta pinta) {
		this.setCor(pinta);
	}

	boolean estaAberta() {
		if (aberta == true) {
			return aberta;
		} else {
			return aberta;
		}

	}

	public static int quantasPortasEstaoAbertas() {
		return portasAbertas;
	}

	// METODO ESPECIAL
	public String Status() {
		String status = "";
		status += "A porta está aberta?: " + this.isAberta();
		status += "\nCor da porta: " + this.getCor();
		status += "\nDimensão X: " + this.getDimensaoX();
		status += "\nDimensão Y: " + this.getDimensaoY();
		status += "\nDimensão Z: " + this.getDimensaoZ();
		return status;
	}
}
