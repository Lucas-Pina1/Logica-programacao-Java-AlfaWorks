public class divisiveisPorTres {
  public static void main(String[] args) {
    Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

    for (int i = 0; i < numeros.length; i++) {
      Integer numero = numeros[i];
      Integer moduloPorTres = numero % 3;

      if (moduloPorTres.equals(0)) {
        System.out.println("Numero " + numero + " é divisivel por 3.");
      }
    }
    System.out.println("Fim!");
  }
}
