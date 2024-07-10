package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    public Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }
    public void removerAluno(long matricula) {
        Set<Aluno> alunoParaRemover = null;
        for (Aluno a: alunoSet) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover.add(a);
            }
        }
        alunoSet.remove(alunoParaRemover);
    }
     public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
     }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new CompararPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunoSet;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }
}
