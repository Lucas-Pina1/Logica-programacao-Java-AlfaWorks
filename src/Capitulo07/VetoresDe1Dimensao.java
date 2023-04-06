package Capitulo07;

import java.util.Scanner;

public class VetoresDe1Dimensao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] cardapio = new String[] { "Calabresa", "Atum", "Queijo", "Presunto" };

    System.out.println("Escolha o sabor: ");

    for (int i = 0; i < cardapio.length; i++) {
      System.out.println("[" + i + "] " + cardapio[i]);
    }

    System.out.print("Digite o número referente ao sabor: ");
    Integer saborEscolhido = scanner.nextInt();

    System.out.println("Você escolheu o sabor: " + cardapio[saborEscolhido]);

    scanner.close();
  }

  // teste

}
