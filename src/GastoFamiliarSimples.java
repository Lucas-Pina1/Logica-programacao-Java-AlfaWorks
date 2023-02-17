import java.util.Scanner;

public class GastoFamiliarSimples {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Double total = 0.0;

    System.out.println("Digite o valor da conta de luz: ");
    total += scanner.nextDouble();

    System.out.println("Digite o valor da conta de água: ");
    total += scanner.nextDouble();

    System.out.println("Digite o valor da conta de telefone: ");
    total += scanner.nextDouble();

    System.out.println("Digite o valor da escola do filho: ");
    total += scanner.nextDouble();

    System.out.println("Digite o valor da conta do cartão: ");
    total += scanner.nextDouble();

    System.out.println("Digite o valor da conta do supermercado: ");
    total += scanner.nextDouble();

    System.out.println("O valor do gasto total do mês foi de : " + total);

    scanner.close();
  }
}
