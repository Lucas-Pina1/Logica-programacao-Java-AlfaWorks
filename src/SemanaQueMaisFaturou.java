public class SemanaQueMaisFaturou {
  public static void main(String[] args) {
    Double[] semanaUm = new Double[] { 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
    Double[] semanaDois = new Double[] { 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
    Double[] semanaTres = new Double[] { 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
    Double[] semanaQuatro = new Double[] { 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

    Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };

    Double maiorFaturamento = 0.0;
    Integer semanaGanhadora = null;

    for (int semana = 0; semana < mes.length; semana++) {
      Double[] semanas = mes[semana];

      Double faturamentoSemana = 0.0;

      for (int dia = 0; dia < semanas.length; dia++) {
        faturamentoSemana += semanas[dia];
      }

      Boolean esseFaturamentoEOMaior = faturamentoSemana > maiorFaturamento;

      if (esseFaturamentoEOMaior) {
        maiorFaturamento = faturamentoSemana;
        semanaGanhadora = semana + 1;
      }
    }
    System.out
        .println("A semana " + semanaGanhadora + " teve o maior faturamento que foi de " + maiorFaturamento + ".");
  }
}