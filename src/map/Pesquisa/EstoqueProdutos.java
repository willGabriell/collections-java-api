package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    public Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                valorTotal = valorTotal + (p.getPreco() * p.getQuantidade());
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        for (Produto p: estoqueProdutoMap.values()) {
            if (p.getPreco() > maiorPreco) {
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }
}
