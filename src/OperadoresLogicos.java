
public class OperadoresLogicos {

	public static void main(String[] args) {
		Boolean carrinhoMaiorQQQue100 = true;
		Boolean periodoDePromocao = true;

		Boolean aplicarDesconto = carrinhoMaiorQQQue100 && periodoDePromocao;

		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
		}

	}

}
