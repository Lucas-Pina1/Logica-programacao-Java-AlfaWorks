
public class OperadoresRelacionais {
  public static void main(String[] args) {
    Boolean tresMaiorQueDois = 3 > 2;
    System.out.println("3 > 2: " + tresMaiorQueDois);

    Boolean tresMenorQueDois = 3 < 2;
    System.out.println("3 < 2? " + tresMenorQueDois);

    Boolean tresMaiorQueTres = 3 > 3;
    System.out.println("3 > 3? " + tresMaiorQueTres);

    Boolean tresMaiorOuIgualQueTres = 3 >= 3;
    System.out.println("3 >= 3? " + tresMaiorOuIgualQueTres);

    Boolean tresMenorOuIgualQueTres = 3 <= 3;
    System.out.println("3 <= 3? " + tresMenorOuIgualQueTres);

    Boolean doisIgualADois = 2 == 2;
    System.out.println("2 == 2? " + doisIgualADois);

    Boolean doisDiferenteDeDois = 2 != 2;
    System.out.println("2 != 2? " + doisDiferenteDeDois);

    Integer quatro = 4;
    Boolean quatroMaiorQuatro = quatro > quatro;
    System.out.println("4 > 4? " + quatroMaiorQuatro);

    Integer sete = 7;
    Boolean seteIgualASete = sete.equals(sete);
    System.out.println("sete.equals(7)? " + seteIgualASete);

    Integer teste128 = 128;
    Integer t128 = 128;
    System.out.println(teste128.equals(t128));
  }
}
