package Capitulo04;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = true;
		Boolean periodoDePromocao = true;
		Boolean jaFezCompraNaLoja = false;
		Boolean pagamentoAvista = true;

		// Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;

		// if (aplicarDesconto) {
		// System.out.println("Sim! Aplique o desconto.");
		// } else {
		// System.out.println("Não aplique o desconto");
		// }

		// Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;

		Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAvista;

		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
		} else {
			System.out.println("Não aplique o desconto");
		}

	}

}
