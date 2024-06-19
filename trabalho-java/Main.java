public class Main {
  public static void main(String[] args) {

    // Criando um instrutor
    Instrutor instrutor = new Instrutor("João", 40, "joao@email.com", "joao123", "senha123", "Programação",
        "Especialista em Java");

    // Criando um curso
    Curso cursoJava = new Curso("Java Básico", "Curso introdutório de Java", instrutor);

    // Criando alunos
    Aluno aluno1 = new Aluno("Maria", 25, "maria@email.com", "maria123", "senha456", "graduação");
    Aluno aluno2 = new Aluno("José", 30, "jose@email.com", "jose123", "senha789", "pós-graduação");

    // Adicionando alunos ao curso
    cursoJava.adicionarAluno(aluno1);
    cursoJava.adicionarAluno(aluno2);

    // Criando aulas
    Aula aula1 = new Aula("Introdução ao Java", "Conceitos básicos de Java", "1h30");
    Aula aula2 = new Aula("Estruturas de Controle", "Loops e Condicional", "2h");

    // Adicionando aulas ao curso
    cursoJava.adicionarAula(aula1);
    cursoJava.adicionarAula(aula2);

  }
}
