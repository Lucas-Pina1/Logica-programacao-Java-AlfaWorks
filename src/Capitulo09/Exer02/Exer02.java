package Capitulo09.Exer02;

public class Exer02 {
  public static void main(String[] args) {

    Produto produto = new Produto();
    produto.nome = "Iphone 14";
    produto.quantidadeEstoque = 7;

    System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + produto.necessarioReporEstoque());

  }
}
