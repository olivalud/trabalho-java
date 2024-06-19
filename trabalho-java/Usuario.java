public class Usuario extends Pessoa {

  protected String username;
  protected String senha;

  public Usuario(String name, int age, String email, String username, String senha) {
    super(name, age, email);
    this.username = username;
    this.senha = senha;
  }

  // Verificar se o login é válido
  public boolean verificarLogin() {
    return true;

  }

  public void fazerLogout() {
    // Logout
  }

  public void atualizarInfo() {
    // Atualizar informações
  }
}

// Atributos - username e senha
// Construtor - inicializa atributos herdados ( name, age, email ) e os novos,
// username e senha
// Métodos - verificarLogin(), fazerLogout(), atualizarInfo