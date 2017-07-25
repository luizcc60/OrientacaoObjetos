package construtoraVeiculos11;

public class Fornecedor {
	// ATRIBUTOS
	private int codigo;
	private String nome;
	private CategoriaFornecedor categoriaFornecedor;
	
	//GETTERS E SETTERS
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
	public CategoriaFornecedor getCategoriaFornecedor() {
		return categoriaFornecedor;
	}
	public void setCategoriaFornecedor(CategoriaFornecedor categoriaFornecedor) {
		this.categoriaFornecedor = categoriaFornecedor;
	}
	
	

}