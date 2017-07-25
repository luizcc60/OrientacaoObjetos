package exercicios06;

public class Aluno extends Pessoa {

	// ATRIBUTOS
	private String turno;
	private String turma;

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	//MÉTODO CONSTRUTOR
	public Aluno(String nome, String dataNascimento, String endereco,String turno, String turma) {
		super(nome, dataNascimento, endereco);
		this.setTurno(turno);
		this.setTurma(turma);

	}
	
	//MÉTODO STATUS
	public void status(){
		System.out.println(this.getNome()+"\n"+this.getDataNascimento()+"\n"+this.getEndereco()+"\n"+this.getTurno()+"\n"+this.getTurma());
	}

}
