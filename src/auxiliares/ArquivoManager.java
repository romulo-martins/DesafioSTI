package auxiliares;

import java.io.*;
import java.util.*;
import aluno.Aluno;

/**
 *
 * @author Romulo
 */

/*
    OBSERVAÇÃO: foi utilizado uma busca sequencial, pois não conheço como é a lógica da matricula e
    qual a lógica de organização dos alunos(provavelmente deve ser pelo hash da matricula).

    Com este conhecimento poderiamos tentar descobrir o ponteiro do arquivo o qual está o aluno.
*/

public class ArquivoManager {

    public static String nomeArquivo = "alunos.csv";

    // procura pelo aluno no arquivo csv, se não achar retorna null
    public static Aluno buscaAluno(String matricula) {

        try {
            Scanner sc = new Scanner(new FileReader(nomeArquivo));
            while (sc.hasNext()) {
                // separa a linha de dados do arquivo
                String[] dados = sc.nextLine().split(";");

                // cria uma instancia do aluno com os dados lidos da linha do arquivo csv
                Aluno novoAluno = new Aluno();
                novoAluno.nome = dados[0];
                novoAluno.matricula = dados[1];
                novoAluno.telefone = dados[2];
                novoAluno.email = dados[3];
                novoAluno.uffmail = dados[4];
                novoAluno.status = dados[5];

                if (novoAluno.matricula.equals(matricula)) {
                    return novoAluno;
                }
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Erro ao tentar ler o arquivo! verifique se o arquivo possue algum erro!");
        }

        return null;
    }

}
