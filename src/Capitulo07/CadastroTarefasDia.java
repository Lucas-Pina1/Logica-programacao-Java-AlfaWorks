package Capitulo07;

import java.util.Scanner;

public class CadastroTarefasDia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] tarefas = new String[5];

    System.out.println("Digite as 5 tarefas mais inportantes do seu dia: ");

    for (int i = 0; i < tarefas.length; i++) {
      System.out.println("Digite a " + (i + 1) + " tarefa: ");
      tarefas[i] = scanner.nextLine();
    }

    System.out.println("suas tarefas são: ");
    for (int i = 0; i < tarefas.length; i++) {
      System.out.println((i + 1) + ": " + tarefas[i]);
    }
    scanner.close();
  }
}
