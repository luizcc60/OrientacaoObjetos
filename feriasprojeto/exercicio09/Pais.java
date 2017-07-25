package exercicio09;

public class Pais {
	// ATRIBUTOS
	private String nome;
	private String nomeCapital;
	private double dimensao;
	private PaisesFronteira fronteiraComPaises;
	
	
	

	// GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeCapital() {
		return nomeCapital;
	}

	public void setNomeCapital(String nomeCapital) {
		this.nomeCapital = nomeCapital;
	}

	public double getDimens�o() {
		return dimensao;
	}

	public void setDimens�o(double dimens�o) {
		this.dimensao = dimens�o;
	}

	public PaisesFronteira getFronteiraComPaises() {
		return fronteiraComPaises;
	}

	public void setFronteiraComPaises(PaisesFronteira fronteiraComPaises) {
		this.fronteiraComPaises = fronteiraComPaises;
	}

	// CONSTRUTOR
	public Pais(String nome, String nomeCapital, double dimensao) {
		this.setNome(nome);
		this.setNomeCapital(nomeCapital);
		this.setDimens�o(dimensao);
	}

	// M�TODO COMPARATIVO
	public boolean equals(Object pais) {
	     if (this.nome == ((Pais) pais).getNome()
	          && this.nomeCapital == ((Pais) pais).getNomeCapital()){
	          return true;
	     }
	     return false;
	}

}
