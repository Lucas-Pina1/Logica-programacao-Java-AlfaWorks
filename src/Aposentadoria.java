import java.util.Scanner;

public class Aposentadoria {
  static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
  static final Integer TEMPO_DECONTRIBUICAO_MINIMO_PARA_APOSENTAR = 25;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite sua idade: ");
    Integer idade = scanner.nextInt();

    System.out.print("Digite seu tempo de contribuição: ");
    Integer tempoContribuicao = scanner.nextInt();

    Boolean temIdadeParaAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR;
    Boolean temTempoDeContribuicao = tempoContribuicao >= TEMPO_DECONTRIBUICAO_MINIMO_PARA_APOSENTAR;

    Boolean podeSeAposentar = temIdadeParaAposentar && temTempoDeContribuicao;

    if (podeSeAposentar) {
      System.out.println("Você pode se aposentar!");
    } else {
      System.out.println("Você ainda não pode se aposentar!");
    }
    scanner.close();
  }
}
