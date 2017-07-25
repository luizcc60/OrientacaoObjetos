package banda12;

import java.util.Date;

public class Banda {
	//ATRIBUTOS
	private int codigo;
	private String nome;
	private Date bandaDTCriacao;
	private Pais pais;
	
	//MÉTODOS
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getBandaDTCriacao() {
		return bandaDTCriacao;
	}
	public void setBandaDTCriacao(Date bandaDTCriacao) {
		this.bandaDTCriacao = bandaDTCriacao;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
