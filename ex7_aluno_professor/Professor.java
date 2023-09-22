package ex7_aluno_professor;

public class Professor extends Pessoa {
	private String disciplina;
	
	public Professor(int codigo, String nome, String endereco, String disciplina) {
		 super(codigo, nome, endereco);
		 this.disciplina = disciplina;
	}
	
	public String getDisciplina() {
		 return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		 this.disciplina = disciplina;
	}
	
	public void ensinar() {
		 System.out.println("O professor está ensinando.");
	}
	
	@Override
	public String toString() {
		 return super.toString() + "\nDisciplina: " + disciplina;
	}
}
