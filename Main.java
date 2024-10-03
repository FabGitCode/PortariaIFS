import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        // Adicionar dados de exemplo ou utilizar métodos para inserir manualmente via Menu
        menu.adicionarEstudante(scanner);
        menu.adicionarCurso(scanner);
        menu.adicionarTurma(scanner);
        menu.registrarHorarioTurma(scanner);

        System.out.println("Digite a matrícula do estudante que deseja verificar a saída: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); 

        Estudante estudante = null;
        for (Estudante e : menu.getListaEstudantes()) {
            if (e.getMatricula() == matricula) {
                estudante = e;
                break;
            }
        }

        if (estudante == null) {
            System.out.println("Estudante não encontrado.");
            return;
        }

        System.out.println("Digite o horário atual (HH:MM): ");
        String horarioAtual = scanner.nextLine();

        boolean emAula = false;
        for (HorarioTurma horario : menu.getHorariosTurma()) {
            if (horario.isHorarioDeAula(horarioAtual)) {
                emAula = true;
                System.out.println("O professor faltou? (true/false)");
                boolean professorFaltou = scanner.nextBoolean();

                if (!professorFaltou) {
                    System.out.println("Não pode sair.");
                    return;
                }
                break;
            }
        }

        if (emAula) {
            System.out.println("Pode sair " + (estudante.isAutorizacaoPais() ? "sozinho." : "com os pais."));
        } else {
            System.out.println("Pode sair " + (estudante.isAutorizacaoPais() ? "sozinho." : "com os pais."));
        }
    }
}
