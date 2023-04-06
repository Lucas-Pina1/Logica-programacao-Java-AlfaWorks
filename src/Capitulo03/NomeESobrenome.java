package Capitulo03;

import java.util.Scanner;

public class NomeESobrenome {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String nome = scanner.nextLine();

    System.out.println("Digite seu Sobrenome: ");
    String sobreNome = scanner.nextLine();

    System.out.println("Olá " + nome + " " + sobreNome + "!");

    scanner.close();
  }
}
