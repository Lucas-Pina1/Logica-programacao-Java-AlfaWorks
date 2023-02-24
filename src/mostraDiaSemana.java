import java.util.Scanner;

public class mostraDiaSemana {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um numero de 1 a 7 para descobrir o dia da semana: ");

    Integer diaSemana = scanner.nextInt();

    String dia;

    switch (diaSemana) {
      case 1:
        dia = "Segunda-feira";
        break;
      case 2:
        dia = "Terça-feira";
        break;
      case 3:
        dia = "Quarta-feira";
        break;
      case 4:
        dia = "Quinta-feira";
        break;
      case 5:
        dia = "Sexta-feira";
        break;
      case 6:
        dia = "Sabado";
        break;
      case 7:
        dia = "Domingo";
        break;
      default:
        dia = "Opção invalida";
        break;
    }
    System.out.println("O dia escolhido foi: " + dia);

    scanner.close();
  }
}
