package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros
{
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void addNumero(int numero) {
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(listaNumeros);
        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }

    public List<Integer> ordenarDescendentes() {
        List<Integer> numerosDescendentes = new ArrayList<>(listaNumeros);
        Collections.sort(numerosDescendentes);
        Collections.reverse(numerosDescendentes);
        return numerosDescendentes;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.addNumero(5);
        ordenacaoNumeros.addNumero(9);
        ordenacaoNumeros.addNumero(7);
        ordenacaoNumeros.addNumero(49);
        ordenacaoNumeros.addNumero(13);
        ordenacaoNumeros.addNumero(58);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendentes());
    }


}
