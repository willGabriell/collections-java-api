package list.operacoesbasicascarrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item i: carrinhoDeCompras) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(i);
            }
        }
        carrinhoDeCompras.removeAll(itemsParaRemover);
    }

    public void calcularValorTotal() {
        double valorTotal = 0;
        for (Item i: carrinhoDeCompras) {
            valorTotal = valorTotal + (i.getPreco() * i.getQuantidade());
        }
        System.out.println(valorTotal);
    }

    public void exibirItens() {
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Arroz", 5.2, 1);
        carrinho.adicionarItem("Feijão", 6.18, 2);
        carrinho.adicionarItem("farinha", 12, 8);

        carrinho.calcularValorTotal();
        carrinho.exibirItens();
    }
}
