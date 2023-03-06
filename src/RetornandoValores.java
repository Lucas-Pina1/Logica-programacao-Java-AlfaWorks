import java.util.Scanner;

public class RetornandoValores {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		imprimir("----------------------------------------------------------");

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		System.out.println("Escolha dentre os cursos abaixo: ");

		interarEExibirPosicoesDoVetrorString(cursos);

		
		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que você deseja é o: ", scanner);

		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos);

		if (!posicaoValida) {
			encerrarProgramaPorPosicaoInvalida();
		}

		imprimir("----------------------------------------------------------");

		String[] formasPagamento = new String[] { "Cartão", "Boleto" };

		imprimir("Escolha dentre as formas de pagamento abaixo: ");

		interarEExibirPosicoesDoVetrorString(formasPagamento);

		imprimirEContinuarMesmaLinha("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);

		if (!posicaoValida) {
			encerrarProgramaPorPosicaoInvalida();
		}

		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

		imprimir("----------------------------------------------------------");

		System.out.println(
				"O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

		scanner.close();
	}

	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
		imprimirEContinuarMesmaLinha(texto);
		Integer numero = scanner.nextInt();

		return numero;
	}

	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}

	static void imprimir(String texto) {
		System.out.println(texto);
	}

	static void interarEExibirPosicoesDoVetrorString(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			imprimir("[" + i + "] " + vetor[i]);
		}
	}

	static void encerrarProgramaPorPosicaoInvalida() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}

	static void imprimirEContinuarMesmaLinha(String texto) {
		imprimir(texto);
	}
}
