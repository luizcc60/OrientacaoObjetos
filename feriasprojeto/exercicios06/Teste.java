package exercicios06;

public class Teste {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Pedro", "13/08/1883", "Rua Joaquim Oliveira", "Vespertino", "AB");
		Professor professor = new Professor("Marcos", "08/08/1993", "Avenida Brasil", "Bacharel Direito", 2500.52d);
		
		
		aluno.status();
		System.out.println("---------------------");
		professor.status();
		System.out.println("---------------------");
		
		
		
		
	}

}
