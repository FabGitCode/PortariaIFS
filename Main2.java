import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        List<Curso> cursos = new ArrayList<>();
        List<Turma> turmas = new ArrayList<>();

        Menu menu = new Menu(estudantes, cursos, turmas);
        menu.exibirMenu();
    }
}
