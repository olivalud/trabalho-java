public class Aluno extends Usuario {
  @SuppressWarnings("unused")
  private String nivel;

  public Aluno(String name, int age, String email, String username, String senha, String nivel) {
    super(name, age, email, username, senha);
    this.nivel = nivel;
  }

  public void inscreverCurso(Curso curso) {
    curso.adicionarAluno(this);
  }

  public void completarCurso(Curso curso) {
  }

  // Polimorfismo
  @Override
  public void atualizarInfo() {
  }

}

// Atributo - ( nivel )
// Construtor - inicializa os atributos herdados e ( nivel )
// Métodos verificarLogin() fazerLogout() atualizarInfo()