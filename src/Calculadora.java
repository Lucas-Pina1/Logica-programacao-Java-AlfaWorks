import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Double primeiroNumero = informeNumero(scanner);
    scanner.close();

    imprimirTraco();

    Integer operacao = escolhaAOperacao(scanner);

    Double segundoNumero = informeNumero(scanner);

    imprimirTraco();

    Double resultado = realizarCalculo(operacao, primeiroNumero, segundoNumero);

    System.out.println("O resultado é: " + resultado);

    scanner.close();
  }

  static Double realizarCalculo(Integer operacao, Double primeiroNumero, Double segundoNumero) {
    Double resultado = null;

    switch (operacao) {
      case 0:
        resultado = subtracao(primeiroNumero, segundoNumero);
        break;
      case 1:
        resultado = adicao(primeiroNumero, segundoNumero);
        break;
      case 2:
        resultado = multiplicacao(primeiroNumero, segundoNumero);
        break;
      case 3:
        resultado = divisao(primeiroNumero, segundoNumero);
        break;
      default:
        System.err.println("Escolha uma operação válida!");
        System.exit(0);
        break;
    }
    return resultado;
  }

  static Double divisao(Double primeiroNumero, Double segundoNumero) {
    Double resultado = primeiroNumero / segundoNumero;
    return resultado;
  }

  static Double multiplicacao(Double primeiroNumero, Double segundoNumero) {
    Double resultado = primeiroNumero * segundoNumero;
    return resultado;
  }

  static Double adicao(Double primeiroNumero, Double segundoNumero) {
    Double resultado = primeiroNumero + segundoNumero;
    return resultado;
  }

  static Double subtracao(Double primeiroNumero, Double segundoNumero) {
    Double resultado = primeiroNumero - segundoNumero;
    return resultado;
  }

  static Integer escolhaAOperacao(Scanner scanner) {
    System.out.println("ESCOLHA A OPERAÇÂO");

    String[] opercoes = new String[] { "Subtração", "Adição", "Multiplicação", "Divisão" };

    for (int i = 0; i < opercoes.length; i++) {
      System.out.println("[" + i + "] " + opercoes[i]);
    }

    System.out.println("Digite a operação: ");

    return scanner.nextInt();
  }

  static Double informeNumero(Scanner scanner) {
    System.out.print("Informe o numero: ");
    return scanner.nextDouble();
  }

  static void imprimirTraco() {
    System.out.println("--------------------------");
  }
}