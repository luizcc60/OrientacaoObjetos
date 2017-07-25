package banda12;

import java.util.Date;

public class Canta {

	//ATRIBUTOS
	private int codigo;
	private Date anoGravacao;
	private Banda banda;
	private Musica musica;
	private Gravadora gravadora;
	private Estilo estilo;
	
	//GETTERS E SETTERS
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getAnoGravacao() {
		return anoGravacao;
	}
	public void setAnoGravacao(Date anoGravacao) {
		this.anoGravacao = anoGravacao;
	}
	public Banda getBanda() {
		return banda;
	}
	public void setBanda(Banda banda) {
		this.banda = banda;
	}
	public Musica getMusica() {
		return musica;
	}
	public void setMusica(Musica musica) {
		this.musica = musica;
	}
	public Gravadora getGravadora() {
		return gravadora;
	}
	public void setGravadora(Gravadora gravadora) {
		this.gravadora = gravadora;
	}
	public Estilo getEstilo() {
		return estilo;
	}
	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}
	
	
	
}
