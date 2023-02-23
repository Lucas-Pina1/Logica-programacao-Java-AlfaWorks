import java.util.Scanner;

public class CalculoBonusFuncionarios {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite meta de faturamento anual da empresa para o ano que passou: ");
    Double meta = scanner.nextDouble();

    System.out.print("Digte faturamento real da empresa no ultimo ano: ");
    Double faturamento = scanner.nextDouble();

    System.out.print("Digte média salarial do funcionário(a) para o ano anterior: ");
    Double mediaSalarial = scanner.nextDouble();

    Boolean bateuMeta = faturamento >= meta;

    Double oitentaPorcentoMeta = (80 * meta) / 100;

    Boolean peloMenosOitentaPorCento = faturamento >= oitentaPorcentoMeta;

    Double bonus = 0.0;

    if (bateuMeta) {
      bonus = mediaSalarial;
      System.out.println("Parabéns, você bateu a meta e recebeu bonus de 100% " + bonus);
    } else if (peloMenosOitentaPorCento) {
      bonus = (80 * mediaSalarial) / 100;
      System.out.println("Parabéns, você bateu 80% da meta e recebeu bonus de 80% " + bonus);
    } else {
      System.out.println("Infelizmente não recebeu bônus");
    }
    scanner.close();
  }
}
