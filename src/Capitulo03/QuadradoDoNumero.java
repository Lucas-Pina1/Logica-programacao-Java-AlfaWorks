package Capitulo03;

import java.util.Scanner;

public class QuadradoDoNumero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o numero inteiro que deseja saber o quadrado: ");
    int numeroDigitado = scanner.nextInt();

    int resultadoQuadradoDoNumero = numeroDigitado * numeroDigitado;

    System.out.println("O quadrado de " + numeroDigitado + " é: " + resultadoQuadradoDoNumero);

    scanner.close();
  }
}
