
import java.io.*;
import java.util.*;

/**
 *
 * @author Romulo
 */
public class Escola {

    public static String nomeArquivo = "alunos.csv";

    // procura pelo aluno no arquivo csv, se não achar retorna null
    public static Aluno buscaAluno(String matricula) {

        try {
            Scanner scanner = new Scanner(new FileReader(nomeArquivo));
            while (scanner.hasNext()) {
                // separa a linha de dados do arquivo
                String[] dados = scanner.nextLine().split(";");

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

        } catch (IOException e) {
            System.out.println("Erro ao tentar ler o arquivo! verifique se o arquivo possue algum erro!");
        }

        return null;
    }

    public static void salvaAluno(Aluno aluno) {
        
        try {
            Scanner scanner = new Scanner(new FileReader(nomeArquivo));
            while (scanner.hasNext()) {
                   
            }

        } catch (IOException e) {
            System.out.println("Erro ao tentar ler o arquivo! verifique se o arquivo possue algum erro!");
        }

    }

}
