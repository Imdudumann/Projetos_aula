package gerenciamentoAlunos;

class Aluno extends Pessoa {
    public Aluno(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    @Override
    public void matricularDisciplina() {
        System.out.println("Aluno " + getNome() + " se matriculou em uma disciplina.");
    }

    @Override
    public void ministrarAula() {
    }
}