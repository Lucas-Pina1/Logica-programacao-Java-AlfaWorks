import java.util.Scanner;

public class CalculadoraSimples {
    public static <Integer> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro(inteiro) numero da operação: ");
        Integer primeiroNumeroDigitado = scanner.nextInt();

        System.out.print(
                "Digite o numero referente a que deseja: [1] - Adição / [2] - Subtração / [3] - Multiplicação / [4] - Divisão: ");
        Integer operacaoEscolhida = scanner.nextInt();

        System.out.print("Digite o segundo(inteiro) numero da operação: ");
        Integer segundoNumeroDigitado = scanner.nextInt();

        boolean adicao = operacaoEscolhida.equals(1);
        boolean subtracao = operacaoEscolhida.equals(2);
        boolean multiplicacao = operacaoEscolhida.equals(3);
        boolean divisao = operacaoEscolhida.equals(4);

        int resultado = 0;

        if (adicao) {

            resultado = primeiroNumeroDigitado + segundoNumeroDigitado;

            System.out.print(
                    "O resultado da soma de " + primeiroNumeroDigitado + " + " + segundoNumeroDigitado + ": "
                            + resultado);
        } else if (subtracao) {

            resultado = primeiroNumeroDigitado - segundoNumeroDigitado;

            System.out.print(
                    "O resultado da subtração de " + primeiroNumeroDigitado + " - " + segundoNumeroDigitado + ": "
                            + resultado);
        } else if (multiplicacao) {

            resultado = primeiroNumeroDigitado * segundoNumeroDigitado;

            System.out.print(
                    "O resultado da multiplicação de " + primeiroNumeroDigitado + " x " + segundoNumeroDigitado + ": "
                            + resultado);
        } else if (divisao) {

            resultado = primeiroNumeroDigitado / segundoNumeroDigitado;

            System.out.print(
                    "O resultado da divisão de " + primeiroNumeroDigitado + " / " + segundoNumeroDigitado + ": "
                            + resultado);
        } else {
            System.out.println("Não encontramos essa operação, reinicie e digite uma opção valida");
        }

        scanner.close();
    }
}
