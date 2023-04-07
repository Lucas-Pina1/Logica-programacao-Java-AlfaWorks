package Capitulo09.Exer02;

public class Produto {

  final static Integer QUANTIDADE_MINIMA_PRODUTO = 10;

  String nome;

  Integer quantidadeEstoque;

  public Boolean necessarioReporEstoque() {
    if (quantidadeEstoque < Produto.QUANTIDADE_MINIMA_PRODUTO) {
      return true;
    }

    return false;
  }
}
