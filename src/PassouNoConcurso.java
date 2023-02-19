import java.util.Scanner;

public class PassouNoConcurso {
  static final Integer NOTA_DESCLASSIFICATORIA_TOTAL = 150;
  static final Integer NOTA_MINIMA_QUE_DEVE_TIRAR_NA_MATERIA = 60;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digte sua nota de português: ");
    Integer notaPortugues = scanner.nextInt();

    System.out.print("Digte sua nota de matemática: ");
    Integer notaMatematica = scanner.nextInt();

    Integer notaFinal = notaPortugues + notaMatematica;

    Boolean atingiuNotaMinimaEmCadaMateria = notaPortugues >= NOTA_MINIMA_QUE_DEVE_TIRAR_NA_MATERIA
        && notaMatematica >= NOTA_MINIMA_QUE_DEVE_TIRAR_NA_MATERIA;

    Boolean atingiuNotaFinalMinima = notaFinal >= NOTA_DESCLASSIFICATORIA_TOTAL;

    Boolean cumpriuOsRequesitosDeAprovacao = atingiuNotaMinimaEmCadaMateria && atingiuNotaFinalMinima;

    if (cumpriuOsRequesitosDeAprovacao) {
      System.out.println("Parabéns, você passou no concurso");
    } else {
      System.out.println("Infelizmente, não passou no concurso");
    }
    scanner.close();
  }
}
