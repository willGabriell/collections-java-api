package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + "acontecerá na data " + proximaData);
            }
        }
    }
}
