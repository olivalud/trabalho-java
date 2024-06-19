import java.util.ArrayList;
import java.util.List;

public class Curso {
  @SuppressWarnings("unused")
  private String titulo;
  @SuppressWarnings("unused")
  private String descricao;
  @SuppressWarnings("unused")
  private Instrutor instrutor;
  private List<Aluno> alunos;
  private List<Aula> aulas;

  public Curso(String titulo, String descricao, Instrutor instrutor) {
    this.titulo = titulo;
    this.descricao = descricao;
    this.instrutor = instrutor;
    this.alunos = new ArrayList<>();
    this.aulas = new ArrayList<>();
  }

  public void adicionarAula(Aula aula) {
    aulas.add(aula);
  }

  public void removerAula(Aula aula) {
    aulas.remove(aula);
  }

  public void adicionarAluno(Aluno aluno) {
    alunos.add(aluno);
  }
}
