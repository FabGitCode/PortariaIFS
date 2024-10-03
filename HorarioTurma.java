import java.util.ArrayList;
import java.util.Scanner;

// Classe HorarioTurma
class HorarioTurma {
    private Turma turma;
    private String diaSemana;
    private String horarioInicio;
    private String horarioFim;
    private int ano;
    private int semestre;

    public HorarioTurma(Turma turma, String diaSemana, String horarioInicio, String horarioFim, int ano, int semestre) {
        this.turma = turma;
        this.diaSemana = diaSemana;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.ano = ano;
        this.semestre = semestre;
    }

    public boolean isHorarioDeAula(String horarioAtual) {
        return horarioAtual.compareTo(horarioInicio) >= 0 && horarioAtual.compareTo(horarioFim) <= 0;
    }

    public Turma getTurma() {
        return turma;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public String getHorarioFim() {
        return horarioFim;
    }
}
