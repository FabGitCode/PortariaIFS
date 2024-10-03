import java.util.Scanner;

// Classe Turma  
class Turma {
    private ArrayList<Estudante> estudantes;
    private int anoTurma;
    private Curso curso;

    public Turma(int anoTurma, Curso curso) {
        this.anoTurma = anoTurma;
        this.curso = curso;
        this.estudantes = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public int getAnoTurma() {
        return anoTurma;
    }

    public Curso getCurso() {
        return curso;
    }
}
