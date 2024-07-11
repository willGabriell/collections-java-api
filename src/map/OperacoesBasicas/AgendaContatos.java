package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos
{
    private Map<String, Integer> AgendaContatoMap;

    public AgendaContatos() {
        AgendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int numero) {
        AgendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome) {
        if (!AgendaContatoMap.isEmpty()) {
            AgendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(AgendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!AgendaContatoMap.isEmpty()) {
            numeroPorNome = (Integer)this.AgendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Policia", 190);
        agendaContatos.adicionarContato("Ambulancia", 181);
        agendaContatos.adicionarContato("Bombeiros", 180);
        agendaContatos.adicionarContato("Vida", 88646);

        System.out.println(agendaContatos.pesquisarPorNome("Policia"));
    }
}
