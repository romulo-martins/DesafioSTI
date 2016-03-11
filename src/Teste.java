import java.util.Scanner;

/**
 *
 * @author Romulo
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);   
        boolean sair = false;
        
        do {
            System.out.println("Informe o número da matricula: ");
            String matricula = sc.next();
            
            Aluno aluno = Escola.buscaAluno(matricula);
            if(aluno != null) {
                System.out.println(aluno);
            }
            else {
                System.out.println("Aluno não encontrado");
            }
            
            System.out.println("Deseja sair(S/N)");
            String opcaoSaida = sc.next();
            if(opcaoSaida.equals("S") || opcaoSaida.equals("s")) {
                sair = true;
            }
            
        } while(!sair);
    }
    
}
