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
                
                System.out.println(aluno.getPrimeiroNome()+",por favor escolha uma das opções abaixo para o seu UFFMail");
                System.out.println("1 - " + listaDeOpcoes.get(0));
                System.out.println("2 - " + listaDeOpcoes.get(1));
                System.out.println("3 - " + listaDeOpcoes.get(2));
                System.out.println("4 - " + listaDeOpcoes.get(3));
                System.out.println("5 - " + listaDeOpcoes.get(4));

                // o usuário escolhe a opção que deseja, caso informe um número inválido ele é avisado 
                int opcao;
                do {
                    opcao = sc.nextInt();
                    if(opcao < 0 || opcao > 5) {
                        System.out.println("Informe uma opção válida!");
                    }
                }while(opcao < 0 || opcao > 5);
                
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
