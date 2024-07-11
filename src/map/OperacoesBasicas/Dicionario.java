package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario
{
    public Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorNome(String palavra) {
        String palavraPorNome = null;
        if (!dicionarioMap.isEmpty()) {
            palavraPorNome = this.dicionarioMap.get(palavra);
        }
        return palavraPorNome;
    }
}
