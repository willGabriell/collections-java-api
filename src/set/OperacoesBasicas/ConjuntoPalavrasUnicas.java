package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas
{
    private Set<Palavra> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    //add palavra
    public void adicioarPalavra(String palavra) {
        palavrasSet.add(new Palavra(palavra));
    }
    //remover palavra
    public void removerPalavra(String palavra) {
        Palavra palavraParaRemover = null;
        for (Palavra p: palavrasSet) {
            if (p.getPalavra() == palavra) {
                palavraParaRemover = p;
                break;
            }
        }
    }

    //verificar palavra
    public void verificarPalavra(String palavra) {
        for (Palavra p: palavrasSet) {
            if (p.getPalavra() == palavra) {
                System.out.println("Palavra Encontrada");
            } else {
                System.out.println("Palavra não encontrada");
            }
        }
    }
    //exibir palavra unica
    public void exibirPalavrasUnicas() {
        if (!this.palavrasSet.isEmpty()) {
            System.out.println(this.palavrasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }

    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicioarPalavra("Amor");
        conjuntoPalavrasUnicas.adicioarPalavra("Amar");
        conjuntoPalavrasUnicas.adicioarPalavra("Ventilador");
        conjuntoPalavrasUnicas.adicioarPalavra("Travesseiro");
        conjuntoPalavrasUnicas.adicioarPalavra("Travesseiro");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
