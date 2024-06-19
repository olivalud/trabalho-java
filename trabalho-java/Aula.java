import java.util.ArrayList;
import java.util.List;

public class Aula {
    private String titulo;
    private String conteudo;
    private String duracao;
    private List<Integer> avaliacoes;

    public Aula(String titulo, String conteudo, String duracao) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.duracao = duracao;
        this.avaliacoes = new ArrayList<>();
    }

    public void assistir() {
        System.out.println("Assistindo à aula: " + titulo);
    }

    public void avaliar(int nota) {
        if (nota >= 1 && nota <= 5) {
            avaliacoes.add(nota);
            System.out.println("Avaliação adicionada: " + nota);
        } else {
            System.out.println("Nota inválida. Por favor, forneça uma nota entre 1 e 5.");
        }
    }

    public List<Integer> getAvaliacoes() {
        return avaliacoes;
    }
}
