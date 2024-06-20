public class Instrutor extends Usuario {

  @SuppressWarnings("unused")
  private String especialidade; // Atributo
  @SuppressWarnings("unused")
  private String bio; // Atributo 

// Construtor
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

  // Polimorfismo: sobrescrever o método atualizarInfo da classe Usuario
  @Override
  public void atualizarInfo() {
    // Atualizar informações do instrutor
  }

}
