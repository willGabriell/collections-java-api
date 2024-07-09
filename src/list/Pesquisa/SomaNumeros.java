package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    public List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int valorTotal = 0;
        if(!listaNumeros.isEmpty()) {
            for (int i: listaNumeros) {
                valorTotal = valorTotal + i;
            }
        }
        return valorTotal;
    }

    public int encontrarMaiorNumero() {
        int maiorValor = 0;
        if (!listaNumeros.isEmpty()) {
            for (int i: listaNumeros) {
                if (i > maiorValor) {
                    maiorValor = i;
                }
            }
        }
        return maiorValor;
    }

    public int encontrarMenorNumero() {
        int mV = encontrarMaiorNumero();
        if (!listaNumeros.isEmpty()) {
            for (int i: listaNumeros) {
                if (i < mV) {
                    mV = i;
                }
            }
        }
        return mV;
    }

    public void exibirNumeros(){
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(79);
        somaNumeros.adicionarNumero(1);

        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
    }
}
