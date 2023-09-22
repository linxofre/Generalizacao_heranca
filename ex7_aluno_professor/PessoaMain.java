package ex7_aluno_professor;

public class PessoaMain {
	public static void main(String[] args) {
		Aluno aluno = new Aluno(1, "Ringor", "Rua Alameda esquina", 145);
		Professor professor = new Professor(2, "Carlotolos", "Rua de lá", "Matemática");
		
		aluno.setEndereco("Rua Nova");
		professor.setDisciplina("Física");
		
		System.out.println("Informações do Aluno:\n" + aluno);
		System.out.println("\nInformações do Professor:\n" + professor);
		
		aluno.estudar();
		professor.ensinar();
	}
}



