package Capitulo12.Exer01;

public class Alunos {

  String nome;

  Alunos(String nome) {
    this.nome = nome;
  }

  String getNome() {
    return nome;
  }

  boolean vemDepoisDe(Alunos aluno) {
    if (aluno == null) {
      return false;
    }

    return nome.compareTo(aluno.nome) > 0;
  }

}
