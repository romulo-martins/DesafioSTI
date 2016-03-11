package main_para_teste;

import projeto.Aluno;
import projeto.ManipulaArquivo;
import java.util.*;

/**
 *
 * @author Romulo
 */
public class Teste {
    
    public static void main(String[] args) {
        String ativo = "Ativo";
        
        Scanner sc = new Scanner(System.in);   
        boolean sair = false;
        
        do {
            System.out.println("Informe o número da matricula: ");
            String matricula = sc.next();
            
            Aluno aluno = ManipulaArquivo.buscaAluno(matricula);
            
            if(aluno != null && aluno.status.equals(ativo)) {
                List<String> listaDeOpcoes = aluno.opcoesEmail();
                
                System.out.println(aluno.getPrimeiroNome()+", por favor escolha uma das opções abaixo para o seu UFFMail");
                
                // foi utilizado um for comun ao inves de um foreach p/ poder aproveitar o indice
                // escrevi a exibição das opções em função da lista que é retornada
                // assim se o método opcoesEmail implementar outras opções não teremos que alterar, a main
                for(int i = 0; i < listaDeOpcoes.size(); i++) {
                    System.out.println((i + 1) + " - " + listaDeOpcoes.get(i));
                }

                // o usuário escolhe a opção que deseja, caso informe um número inválido ele é avisado 
                int opcao;
                do {
                    opcao = sc.nextInt() - 1; // em termos de indice trabalha-se de 0 a 4
                    if(opcao < 0 || opcao > listaDeOpcoes.size()) {
                        System.out.println("Informe uma opção válida!");
                    }
                }while(opcao < 0 || opcao > listaDeOpcoes.size());
                
                // exibe a mesagem final
                System.out.println("A criação de seu e-mail "+listaDeOpcoes.get(opcao)+
                        " será feita nos próximos minutos.");
                System.out.println("Um SMS foi enviado para ("+aluno.telefone+") com a sua senha de acesso.");
                
            }
            else {
                System.out.println("Aluno não encontrado, ou inativo");
            }                        
            
            // verifica se o cliente deseja sair do programa
            System.out.println("Deseja sair(S/N)");
            String opcaoSaida = sc.next();
            if(opcaoSaida.equals("S") || opcaoSaida.equals("s")) {
                sair = true;
            }
            
        } while(!sair);
    }
    
}
