package Capitulo05;

public class EstruturaIf {
  public static void main(String[] args) {
    Double emprestimo = 4000.0;
    Double movimentacaoMedia = 2000.0;

    Boolean movimentaPeloMenosMEtadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
    Boolean aContaTemTempoSuficienteDeAbertura = true;
    Boolean temNomeLimpo = true;

    if (movimentaPeloMenosMEtadeDoValor && aContaTemTempoSuficienteDeAbertura && temNomeLimpo) {
      System.out.println("Sim! Pode liberar empréstimo");
    } else {
      System.out.println("Não pode liberar o empréstimo");
    }
  }
}
