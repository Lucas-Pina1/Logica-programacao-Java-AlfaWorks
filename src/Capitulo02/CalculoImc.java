package Capitulo02;

import java.util.Scanner;

public class CalculoImc {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu peso(kg): ");
    Double peso = scanner.nextDouble();

    System.out.println("Digite sua altura(m): ");
    Double altura = scanner.nextDouble();

    Double resultadoImc = peso / (altura * altura);

    System.out.println("Seu IMC é de: " + resultadoImc);

    scanner.close();
  }
}
