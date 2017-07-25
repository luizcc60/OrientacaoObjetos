package construtoraVeiculos11;

public class Peca {

	private int codigo;
	private String nome;
	private double preco;
	private String cor;
	private CategoriaPeca categoriaPeca;

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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public CategoriaPeca getCategoriaPeca() {
		return categoriaPeca;
	}

	public void setCategoriaPeca(CategoriaPeca categoriaPeca) {
		this.categoriaPeca = categoriaPeca;
	}

}
