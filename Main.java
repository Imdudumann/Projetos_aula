package gerenciamentoAlunos;

public class Main {

	public static void main(String[] args) {
		Escola escola = new Escola();

        Aluno aluno1 = new Aluno("João", "Rua A, 123", "123456789");
        Aluno aluno2 = new Aluno("Maria", "Rua B, 456", "987654321");
        Professor professor1 = new Professor("Carlos", "Rua X, 789", "456123789");

        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        escola.adicionarProfessor(professor1);

        aluno1.matricularDisciplina();
        professor1.ministrarAula();

	}

}
