import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Integer> avaliacoes = new ArrayList<>();

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
    Aula aula = new Aula("Introdução ao Java", "Conceitos básicos de Java", "1h30");

    // Assistir a aula
    aula.assistir();

    // Avaliar a aula
    aula.avaliar(4);
    aula.avaliar(5);
    aula.avaliar(2);
    aula.avaliar(3);

    // Adicionando aulas ao curso
    System.out.println("Avaliações:");
    for (Integer nota : aula.getAvaliacoes()) {
      System.out.println("- " + nota);

    }
  }
}
