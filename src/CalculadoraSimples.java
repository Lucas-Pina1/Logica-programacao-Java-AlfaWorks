import java.util.Scanner;

public class CalculadoraSimples {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro(inteiro) numero da operação: ");
    Integer primeiroNumeroDigitado = scanner.nextInt();

    System.out.print(
        "Digite o numero referente a que deseja: [1] - Adição / [2] - Subtração / [3] - Multiplicação / [4] - Divisão: ");
    Integer operacaoEscolhida = scanner.nextInt();

    System.out.print("Digite o segundo(inteiro) numero da operação: ");
    Integer segundoNumeroDigitado = scanner.nextInt();

    Boolean adicao = operacaoEscolhida.equals(1);
    Boolean subtracao = operacaoEscolhida.equals(2);
    Boolean multiplicacao = operacaoEscolhida.equals(3);
    Boolean divisao = operacaoEscolhida.equals(4);

    Integer resultado = 0;

    if (adicao) {
      Integer operacaoAdicao = primeiroNumeroDigitado + segundoNumeroDigitado;

      resultado = operacaoAdicao;

      System.out.print(
          "O resultado da soma de " + primeiroNumeroDigitado + " + " + segundoNumeroDigitado + ": " + resultado);
    } else if (subtracao) {
      Integer operacaoSubtracao = primeiroNumeroDigitado - segundoNumeroDigitado;

      resultado = operacaoSubtracao;

      System.out.print(
          "O resultado da subtração de " + primeiroNumeroDigitado + " - " + segundoNumeroDigitado + ": " + resultado);
    } else if (multiplicacao) {
      Integer operacaoMultiplicacao = primeiroNumeroDigitado * segundoNumeroDigitado;

      resultado = operacaoMultiplicacao;

      System.out.print(
          "O resultado da multiplicação de " + primeiroNumeroDigitado + " x " + segundoNumeroDigitado + ": "
              + resultado);
    } else if (divisao) {
      Integer operacaoDivisao = primeiroNumeroDigitado / segundoNumeroDigitado;

      resultado = operacaoDivisao;

      System.out.print(
          "O resultado da divisão de " + primeiroNumeroDigitado + " / " + segundoNumeroDigitado + ": "
              + resultado);
    } else {
      System.out.println("Não econtramos essa operação, renicie e digite uma opção valida");
    }

    scanner.close();
  }
}
