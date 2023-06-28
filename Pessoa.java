package gerenciamentoAlunos;

abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    
    public abstract void matricularDisciplina();

    
    public abstract void ministrarAula();
}
