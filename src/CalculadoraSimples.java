import java.util.Scanner;

public class CalculadoraSimples {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro(inteiro) numero da operação: ");
    Integer primeiroNumeroDigitado = scanner.nextInt();

    System.out.print("Digite o numero referente a que deseja: [1] - Adição / [2] - Subtração / [3] - Multiplicação / [4] - Divisão / [5] - Modulo ");
    Integer operacaoEscolhida = scanner.nextInt();

    System.out.print("Digite o segundo(inteiro) numero da operação: ");
    Integer segundoNumeroDigitado = scanner.nextInt();

    Integer resultado = 0;
    
    switch (operacaoEscolhida ) {
      case 1:
      Integer soma = primeiroNumeroDigitado + segundoNumeroDigitado;
      resultado = soma;
      System.out.print("O resultado da soma de " + primeiroNumeroDigitado +  " + " + segundoNumeroDigitado + ": " + resultado);
        break;
      case 2:
        Integer subtracao = primeiroNumeroDigitado - segundoNumeroDigitado;
        resultado = subtracao;
        System.out.print("O resultado da subtração de " + primeiroNumeroDigitado +  " + " + segundoNumeroDigitado + ": " + resultado);
        break;
    
      default:
        break;

      }
      scanner.close();
  }
}
