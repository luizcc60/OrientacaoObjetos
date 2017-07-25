package exercicios06;

public class Professor extends Pessoa {

	private String formacao;
	private double salario;

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;

	}

	// MÉTODOS CONSTRUTORES
	public Professor(String nome, String dataNascimento, String endereco,String formacao, double salario) {
		super(nome, dataNascimento, endereco);
		this.setFormacao(formacao);
		this.setSalario(salario);
	}
	
	//MÉTODOS ESPECIAIS
	public void status(){
		System.out.println(this.getNome()+"\n"+this.getDataNascimento()+"\n"+this.getEndereco()+"\n"+this.getFormacao()+"\n"+this.getSalario());
	}
}
