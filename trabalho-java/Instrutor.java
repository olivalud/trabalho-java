public class Instrutor extends Usuario {

  @SuppressWarnings("unused")
  private String especialidade;
  @SuppressWarnings("unused")
  private String bio;

  public Instrutor(String name, int age, String email, String username, String senha, String especialidade,
      String bio) {
    super(name, age, email, username, senha);
    this.especialidade = especialidade;
    this.bio = bio;
  }

  public Curso criarCurso(String titulo, String descricao) {
    return new Curso(titulo, descricao, this);
  }

  public void atribuirNota(Aluno aluno, int nota) {
    // Atribuir nota
  }

  // Polimorfismo
  @Override
  public void atualizarInfo() {
    // Atualizar informações do instrutor
  }

}
