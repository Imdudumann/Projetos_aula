package gerenciamentoAlunos;

import java.util.ArrayList;
import java.util.List;

class Escola {
    private List<Aluno> alunos;
    private List<Professor> professores;

    public Escola() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void removerProfessor(Professor professor) {
        professores.remove(professor);
    }

}