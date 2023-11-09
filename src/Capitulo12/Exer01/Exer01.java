package Capitulo12.Exer01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exer01 {
  public static void main(String[] args) throws IOException {

    Path arquivo = Paths.get("C:/temp/alunos.txt");

    List<String> linhas = Files.readAllLines(arquivo);

    ListaAluno listaAlunos = new ListaAluno();

    for (String nome : linhas) {
      Alunos aluno = new Alunos(nome);
      listaAlunos.adicionar(aluno);
    }

    listaAlunos.ordenar();

    Path arquivoOrdenado = Paths.get("C:/temp/alunos.txt");

    List<String> nomesOrdenados = new ArrayList<>();
    for (Alunos aluno : listaAlunos.getAluno()) {
      nomesOrdenados.add(aluno.getNome());
    }

    Files.write(arquivoOrdenado, nomesOrdenados);
  }
}
