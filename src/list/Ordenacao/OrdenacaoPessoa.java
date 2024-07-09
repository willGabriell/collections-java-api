package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa
{
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa()
    {
        this.pessoaList = new ArrayList<>();
    }

    public void addPessoa(String nome, int idade, double altura)
    {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade()
    {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura()
    {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.addPessoa("Nome 01", 18, 1.77);
        ordenacaoPessoa.addPessoa("Nome 02", 16, 1.89);
        ordenacaoPessoa.addPessoa("Nome 03", 15, 1.95);
        ordenacaoPessoa.addPessoa("Nome 04", 29, 1.62);

        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

    }
}
