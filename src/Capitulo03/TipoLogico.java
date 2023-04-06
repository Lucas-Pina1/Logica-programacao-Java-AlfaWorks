package Capitulo03;

public class TipoLogico {
  public static void main(String[] args) {
    Boolean variavelVerdadeira = true;
    System.out.println("Variável verdadeira: " + variavelVerdadeira);

    Boolean variavelFalsa = false;
    System.out.println("Variável falsa: " + variavelFalsa);

    System.out.println("--------------------------------------------");

    int idade = 19;

    Boolean podeTirarCarteira = idade >= 18;

    if (podeTirarCarteira) {
      System.out.println("Sim, pode tirar a carteira.");
    } else {
      System.out.println("Não! Ele(a) não pode tirar carteira.");
    }

    // System.out.println("Pode tirar carteira? " + podeTirarCarteira);
  }
}
