package poo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    /*
     * Uma lista constante quer dizer que apenas o espaço de memoria
     * onde ela foi criada não muda, o conteudo da lista é variavel.
     */

    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarcurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nome) {

        for (Curso curso : this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

    public String toString() {
        return nome;
    }
}
