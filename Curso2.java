// Classe Curso 
class Curso {
    private String codigo;
    private String nome;
    private boolean ativo;

    public Curso(String codigo, String nome, boolean ativo) {
        this.codigo = codigo;
        this.nome = nome;
        this.ativo = ativo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
