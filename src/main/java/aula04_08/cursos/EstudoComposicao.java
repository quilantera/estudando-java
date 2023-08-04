package aula04_08.cursos;

import java.util.ArrayList;
import java.util.List;

public class EstudoComposicao {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gustavo", "4591235600");
        Aluno aluno2 = new Aluno("Gustava", "2423465600");
        Aluno aluno3 = new Aluno("Bruna", "2357655600");
        List<Aluno> alunos = new ArrayList<Aluno>(List.of(aluno1,aluno2,aluno3));
        Professor professor = new Professor("Gabriel", "234.452.233-2");
        Curso curso = new Curso("Java",2.43F,professor,alunos);
        System.out.println(curso.getProfessor().getNome());
        System.out.println(curso.getAlunos().get(2).getNome());
    }
}
