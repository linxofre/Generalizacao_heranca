package ex7_aluno_professor;

public class PessoaMain {
	public static void main(String[] args) {
		Aluno aluno = new Aluno(1, "Ringor", "Rua Alameda esquina", 145);
		Professor professor = new Professor(2, "Carlotolos", "Rua de l�", "Matem�tica");
		
		aluno.setEndereco("Rua Nova");
		professor.setDisciplina("F�sica");
		
		System.out.println("Informa��es do Aluno:\n" + aluno);
		System.out.println("\nInforma��es do Professor:\n" + professor);
		
		aluno.estudar();
		professor.ensinar();
	}
}



