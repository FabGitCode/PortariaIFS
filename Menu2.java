import java.util.ArrayList;
import java.util.Scanner;

// Classe Menu para gerenciar as operações
class Menu {
    private ArrayList<Estudante> listaEstudantes;
    private ArrayList<Curso> listaCursos;
    private ArrayList<Turma> listaTurmas;
    private ArrayList<HorarioTurma> horariosTurma;

    public Menu() {
        listaEstudantes = new ArrayList<>();
        listaCursos = new ArrayList<>();
        listaTurmas = new ArrayList<>();
        horariosTurma = new ArrayList<>();
    }

    public void adicionarEstudante(Scanner scanner) {
        System.out.println("Digite o nome do estudante: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF do estudante: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite o email do estudante: ");
        String email = scanner.nextLine();
        System.out.println("Digite a matrícula do estudante: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();  
        System.out.println("Digite o email do responsável: ");
        String emailResponsavel = scanner.nextLine();
        System.out.println("O estudante tem autorização para sair sozinho? (true/false)");
        boolean autorizacaoPais = scanner.nextBoolean();

        Estudante estudante = new Estudante(nome, cpf, email, matricula, emailResponsavel, autorizacaoPais);
        listaEstudantes.add(estudante);
    }

    public void adicionarCurso(Scanner scanner) {
        System.out.println("Digite o código do curso: ");
        String codigo = scanner.nextLine();
        System.out.println("Digite o nome do curso: ");
        String nome = scanner.nextLine();
        System.out.println("O curso está ativo? (true/false)");
        boolean ativo = scanner.nextBoolean();

        Curso curso = new Curso(codigo, nome, ativo);
        listaCursos.add(curso);
    }

    public void adicionarTurma(Scanner scanner) {
        System.out.println("Digite o ano da turma: ");
        int anoTurma = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Escolha um curso para a turma:");
        for (int i = 0; i < listaCursos.size(); i++) {
            System.out.println((i + 1) + ". " + listaCursos.get(i).getNome());
        }
        int escolhaCurso = scanner.nextInt();
        Curso curso = listaCursos.get(escolhaCurso - 1);

        Turma turma = new Turma(anoTurma, curso);
        listaTurmas.add(turma);
    }

    public void registrarHorarioTurma(Scanner scanner) {
        System.out.println("Escolha uma turma para registrar o horário:");
        for (int i = 0; i < listaTurmas.size(); i++) {
            System.out.println((i + 1) + ". Turma do curso " + listaTurmas.get(i).getCurso().getNome());
        }
        int escolhaTurma = scanner.nextInt();
        scanner.nextLine();  
        Turma turma = listaTurmas.get(escolhaTurma - 1);

        System.out.println("Digite o dia da semana (ex: Segunda-feira): ");
        String diaSemana = scanner.nextLine();
        System.out.println("Digite o horário de início (HH:MM): ");
        String horarioInicio = scanner.nextLine();
        System.out.println("Digite o horário de fim (HH:MM): ");
        String horarioFim = scanner.nextLine();

        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();
        System.out.println("Digite o semestre: ");
        int semestre = scanner.nextInt();

        HorarioTurma horario = new HorarioTurma(turma, diaSemana, horarioInicio, horarioFim, ano, semestre);
        horariosTurma.add(horario);
    }

    public ArrayList<HorarioTurma> getHorariosTurma() {
        return horariosTurma;
    }

    public ArrayList<Estudante> getListaEstudantes() {
        return listaEstudantes;
    }
}
