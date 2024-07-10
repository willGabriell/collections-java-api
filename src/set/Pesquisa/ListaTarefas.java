package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas
{
    public Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        for (Tarefa t: tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover = t;
                break;
            }
        }
        tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        System.out.println(tarefaSet.size());
    }

    public void MarcarTarefaConcluida(String descricao) {
        for (Tarefa t: tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
                break;
            }
        }
    }

    public void MarcarTarefaPendente(String descricao) {
        for (Tarefa t: tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
            }
        }
    }

    public Set<Tarefa> ExibirTarefasConcluidas() {
        Set<Tarefa> tarefasParaExibir = new HashSet<>();
        for (Tarefa t: tarefaSet) {
            if (t.isConcluida() == true) {
                tarefasParaExibir.add(t);
            }
        }
        return tarefasParaExibir;
    }

    public Set<Tarefa> ExibirTarefasPendentes() {
        Set<Tarefa> tarefasParaExibir = new HashSet<>();
        for (Tarefa t: tarefaSet) {
            if (t.isConcluida() == false) {
                tarefasParaExibir.add(t);
            }
        }
        return tarefasParaExibir;
    }

    public void LimparLista() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Ir para a academia");
        listaTarefas.adicionarTarefa("Voltar da academia");
        listaTarefas.adicionarTarefa("Concluir o módulo de set");
        listaTarefas.adicionarTarefa("tomar banho");
        listaTarefas.adicionarTarefa("escovar os dentes");
        listaTarefas.adicionarTarefa("dormir cedo");

        listaTarefas.removerTarefa("ir para a academia");

        listaTarefas.MarcarTarefaConcluida("dormir cedo");
        listaTarefas.MarcarTarefaConcluida("escovar os dentes");

        System.out.println(listaTarefas.ExibirTarefasPendentes());
        listaTarefas.exibirTarefas();
    }
}
