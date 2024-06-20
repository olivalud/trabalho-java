public class Pessoa {

  protected String name;
  protected int age;
  protected String email;

// Construtor
  public Pessoa(String name, int age, String email) {
    this.name = name;
    this.age = age;
    this.email = email;
  }

  // Sobrecarga dos métodos de atualizar as infos
  public void atualizarInfo(String name) {
    this.name = name;
  }

  public void atualizarInfo(int age) {
    this.age = age;
  }

  public void atualizarEmail(String email) {
    this.email = email;
  }
}

// Construtor - Inicializa os atributos
// Atributos - Nome, idade e email. ( name, age, email )
// Métodos 'atualizarInfo' 'atualizarEmail' - 3 métodos SOBRECARREGADOS para atualizar ( name, age, email.
