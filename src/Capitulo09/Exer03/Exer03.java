package Capitulo09.Exer03;

public class Exer03 {
  public static void main(String[] args) {

    Pedido pedido = new Pedido();

    pedido.setCodigo(1);
    pedido.setSubtotal(100.0);
    pedido.setDesconto(5.0);

    System.out.println("Código: " + pedido.getCodigo() + ", Subtotal: " + pedido.getSubtotal() +
        ", Desconto: " + pedido.getDesconto() + ", Total: " + pedido.getTotal());

  }
}
