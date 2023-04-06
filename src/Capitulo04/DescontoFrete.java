package Capitulo04;

import java.util.Scanner;

public class DescontoFrete {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor do produto: ");
		double valorProduto = scanner.nextDouble();

		int frete = 15;

		Boolean freteGratis = valorProduto >= 100;

		double valorTotal = valorProduto + frete;

		if (freteGratis) {
			frete = 0;
			double valorTotalFreteGratis = valorProduto + frete;

			System.out.println("Parabéns seu é frete grátis");

			System.out.println("Valor do produto: " + valorProduto + " R$ " + " Valor do frete: " + frete + " R$ ");

			System.out.println("O valor total do seu produto é: " + valorTotalFreteGratis);
		} else {
			System.out.println("Valor do produto: " + valorProduto + " R$ " + " Valor do frete: " + frete + " R$ ");

			System.out.println("O valor total do seu produto é: " + valorTotal);
		}

		scanner.close();
	}
}
