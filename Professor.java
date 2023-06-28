package gerenciamentoAlunos;

class Professor extends Pessoa {
    public Professor(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    @Override
    public void matricularDisciplina() {
    }

    @Override
    public void ministrarAula() {
        System.out.println("Professor " + getNome() + " está ministrando uma aula.");
    }
}