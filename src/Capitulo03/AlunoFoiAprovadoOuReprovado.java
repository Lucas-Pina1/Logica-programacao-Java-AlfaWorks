package Capitulo03;

import java.util.Scanner;

public class AlunoFoiAprovadoOuReprovado {
  static final int NOTA_MINIMA_PARA_SER_APROVADO = 70;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a nota do aluno: ");
    double notaAluno = scanner.nextDouble();

    Boolean aprovado = notaAluno >= NOTA_MINIMA_PARA_SER_APROVADO;

    if (aprovado) {
      System.out.println("Parabéns! o aluno foi aprovado");
    } else {
      System.out.println("Infelizmente o aluno foi reprovado =/");
    }

    scanner.close();
  }
}
