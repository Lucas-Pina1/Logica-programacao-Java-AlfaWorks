package Capitulo12.Exer01;

import java.util.ArrayList;
import java.util.List;

public class ListaAluno {

  private List<Alunos> lista;

  public ListaAluno() {
    lista = new ArrayList<>();
  }

  public void adicionar(Alunos aluno) {
    lista.add(aluno);
  }

  public void ordenar() {
    int tamanhoLista = lista.size();

    for (int i = 1; i < tamanhoLista; i++) {
      Alunos alunoPosicaoBase = lista.get(i);
      int indicePosicaoBase = i;

      while (indicePosicaoBase > 0) {
        int indicePosicaoAnterior = indicePosicaoBase - 1;
        Alunos alunoPosicaoAnterior = lista.get(indicePosicaoAnterior);

        boolean alunoPosicaoAnteriorVemDepoisDe = alunoPosicaoAnterior == null
            || alunoPosicaoAnterior.vemDepoisDe(alunoPosicaoBase);

        if (alunoPosicaoAnteriorVemDepoisDe) {
          lista.set(indicePosicaoBase, alunoPosicaoAnterior);

          indicePosicaoBase--;
        } else {
          break;
        }
      }

      lista.set(indicePosicaoBase, alunoPosicaoBase);
    }
  }

  public List<Alunos> getAluno() {
    return lista;
  }

}
