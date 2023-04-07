package Capitulo09.Exer01;

public class Exer01 {
  public static void main(String[] args) {

    Produto produto = new Produto();
    produto.nome = "Iphone 14";
    produto.quantidadeEstoque = 7;

    System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + necessarioReporEstoque(produto));

  }

  static public Boolean necessarioReporEstoque(Produto produto) {
    if (produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_PRODUTO) {
      return true;
    }

    return false;
  }
}
