package Capitulo03;

import java.util.Scanner;

public class DescontoProduto {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor do produto: ");
    Double valorDoProduto = scanner.nextDouble();

    System.out.print("Digite a quantidade de produtos: ");
    Double quantidadeDeProdutos = scanner.nextDouble();

    Double valor = valorDoProduto * quantidadeDeProdutos;

    Boolean temDesconto = quantidadeDeProdutos >= 10;

    Double taxaDesconto = 0.0;

    if (temDesconto) {
      taxaDesconto = 10.0;
    }

    Double desconto = valor * taxaDesconto / 100;

    Double valorTotal = valor - desconto;

    System.out.println("Valor total da compra foi de: " + valorTotal);

    scanner.close();
  }
}
