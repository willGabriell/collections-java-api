package set;

public class Palavra
{
    String palavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public String toString() {
        return "Palavra{" +
                "palavra='" + palavra + '\'' +
                '}';
    }
}
