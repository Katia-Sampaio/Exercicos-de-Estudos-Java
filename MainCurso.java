package poo;

public class MainCurso {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Ana");
        Aluno aluno3 = new Aluno("Alana");

        Curso curso1 = new Curso("Java completo");
        Curso curso2 = new Curso("JavaScript");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarcurso(curso3);
        aluno2.adicionarcurso(curso3);
        aluno3.adicionarcurso(curso3);

        for (Aluno aluno : curso3.alunos) {
            System.out.println("Estou matriculado no curso " + curso3.nome + ", meu nome é "
                    + aluno.nome);
            System.out.println();
        }

        System.out.println(aluno1.cursos.get(0).alunos);

        Curso CursoEncontrado = aluno1.obterCursoPorNome("Java completo");

        if (CursoEncontrado != null) {
            System.out.println(CursoEncontrado.nome);
            System.out.println(CursoEncontrado.alunos);
        }

    }
}
