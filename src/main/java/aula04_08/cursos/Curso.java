package aula04_08.cursos;

import java.util.List;

public class Curso {
    //composicao de objetos -> representacao de uma classe dentro de outra;
    private  String nome;
    private Float cargaHoraria;
    private Professor professor;
    private List<Aluno> alunos;
    public Curso() {
    }
    public Curso(String nome, Float cargaHoraria, Professor professor, List<Aluno> alunos) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public Float getCargaHoraria() {
        return cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(Float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
