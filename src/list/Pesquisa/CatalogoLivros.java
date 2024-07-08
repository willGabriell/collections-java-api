package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String autor, int ano) {
        livrosList.add(new Livro(nome, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l: livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicical, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();
        if (!livrosList.isEmpty())
           for (Livro l: livrosList) {
               if (anoInicical <= l.getAno() && l.getAno() <= anoFinal) {
                   livrosPorAno.add(l);
               }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l: livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
           CatalogoLivros catalogoLivros = new CatalogoLivros();

           catalogoLivros.adicionarLivro("Livro 1", "Fulano", 1997);
           catalogoLivros.adicionarLivro("Livro 2", "eu", 1988);
           catalogoLivros.adicionarLivro("Livro 3", "Fulano", 2008);

        System.out.println(catalogoLivros.pesquisarPorAutor("fulano"));

    }
}
