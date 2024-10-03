// Classe Estudante
class Estudante {
    private String nome;
    private String cpf;
    private String email;
    private int matricula;
    private String emailResponsavel;
    private boolean autorizacaoPais;

    public Estudante(String nome, String cpf, String email, int matricula, String emailResponsavel, boolean autorizacaoPais) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.matricula = matricula;
        this.emailResponsavel = emailResponsavel;
        this.autorizacaoPais = autorizacaoPais;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getEmailResponsavel() {
        return emailResponsavel;
    }

    public boolean isAutorizacaoPais() {
        return autorizacaoPais;
    }
}
