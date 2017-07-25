package exercicios06;

public abstract class Pessoa {
	// ATRIBUTOS
	private String nome;
	private String dataNascimento;
	private String endereco;

	// GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void status(){
		System.out.println(this.getNome()+"\n"+this.getDataNascimento()+"\n"+this.getEndereco());
	}

	// MÉTODOS CONSTRUTOR
	public Pessoa(String nome, String dataNascimento, String endereco) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	
	}

}
