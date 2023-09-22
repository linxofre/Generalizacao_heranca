package ex7_aluno_professor;

public class Aluno extends Pessoa {
	private int matricula;
	
	public Aluno(int codigo, String nome, String endereco, int matricula) {
	   super(codigo, nome, endereco);
	   this.matricula = matricula;
	}
	
	public int getMatricula() {
	   return matricula;
	}
	
	public void setMatricula(int matricula) {
	   this.matricula = matricula;
	}
	
	public void estudar() {
	   System.out.println("O aluno está estudando.");
	}
	
	@Override
	public String toString() {
	   return super.toString() + "\nMatrícula: " + matricula;
	}
}
