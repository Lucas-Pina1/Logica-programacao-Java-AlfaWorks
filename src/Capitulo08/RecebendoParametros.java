package Capitulo08;

import java.util.Scanner;

public class RecebendoParametros {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    imprimir("----------------------------------------------------------");

    String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

    System.out.println("Escolha dentre os cursos abaixo: ");

    interarEExibirPosicoesDoVetrorString(cursos);

    imprimirEContinuarMesmaLinha("O curso que você deseja é o: ");
    Integer posicaoCursoEscolhido = scanner.nextInt();

    Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

    if (!posicaoValida) {
      encerrarProgramaPorPosicaoInvalida();
    }

    imprimir("----------------------------------------------------------");

    String[] formasPagamento = new String[] { "Cartão", "Boleto" };

    imprimir("Escolha dentre as formas de pagamento abaixo: ");

    interarEExibirPosicoesDoVetrorString(formasPagamento);

    imprimirEContinuarMesmaLinha("Sua forma de pagamento escolhida é: ");
    Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

    posicaoValida = posicaoFormaPagamentoEscolhida >= 0
        && posicaoFormaPagamentoEscolhida < formasPagamento.length;

    if (!posicaoValida) {
      encerrarProgramaPorPosicaoInvalida();
    }

    String cursoEscolhido = cursos[posicaoCursoEscolhido];
    String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

    imprimir("----------------------------------------------------------");

    System.out
        .println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

    scanner.close();
  }

  static void interarEExibirPosicoesDoVetrorString(String[] vetor) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("[" + i + "] " + vetor[i]);
    }
  }

  static void imprimir(String texto) {
    System.out.println(texto);
  }

  static void encerrarProgramaPorPosicaoInvalida() {
    System.err.println("Posição inválida!");
    System.exit(1);
  }

  static void imprimirEContinuarMesmaLinha(String texto) {
    System.out.println(texto);
  }
}
