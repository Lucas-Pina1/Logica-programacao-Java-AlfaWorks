import java.util.Scanner;

public class Tabuada {
  public static void main(String[] args) {
    Integer multiplicador = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o numero que deseja receber a tabuada: ");
    Integer numero = scanner.nextInt();

    imprimirTabuada(numero, multiplicador);

    scanner.close();
  }

  static void imprimirTabuada(Integer numero, Integer multiplicador) {
    Integer resultado = (numero * multiplicador);

    System.out.println(numero + " * " + multiplicador + " = " + resultado);

    if (++multiplicador <= 10) {
      imprimirTabuada(numero, multiplicador);
    }
  }
}
