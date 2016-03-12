package projeto;

import java.util.*;

/**
 *
 * @author Romulo
 */
public class Aluno {

    //LEMBRETE : encapsular os atributos da classe
    // os atributos da classe aluno ficaram sem encapsulamento para simplificar o codigo
    public String nome;
    public String matricula;
    public String telefone;
    public String email;
    public String uffmail;
    public String status;

    public Aluno() { }
    
    // Neste método deduzi que todos os nomes irão vir no padrão primeiroNome + segundoNome + terceiroNome, como mostra no arquivo csv
    public List<String> opcoesEmail() {
        List<String> listaDeEmails = new ArrayList<>();              
        String email = "@id.uff.br";

        try {

            String[] nomes = nome.split(" ");
            String primeiroNome = nomes[0].toLowerCase();
            String segundoNome = nomes[1].toLowerCase();
            String terceiroNome = nomes[2].toLowerCase();            
            
            listaDeEmails.add(primeiroNome + "_" + segundoNome+email); // ex: laura_azevedo@id.uff.br
            listaDeEmails.add(primeiroNome + segundoNome.charAt(0) + terceiroNome.charAt(0) + email); // ex: lauraac@id.uff.br
            listaDeEmails.add(primeiroNome + terceiroNome + email);// ex: lauracunha@id.uff.br
            listaDeEmails.add(primeiroNome.charAt(0) + terceiroNome + email); // lcunha@id.uff.br
            listaDeEmails.add(primeiroNome.charAt(0) + segundoNome + terceiroNome + email); //lazevedocunha@id.uff.br

        } catch (Exception e) {
            System.out.println("Erro ao tentar gerar as opções de emails! tente novamente");
        }

        return listaDeEmails;
    }
    
    // retorna o primeiro nome do usuário
    public String getPrimeiroNome() {
        String[] nomes = this.nome.split(" ");
        return nomes[0];
    }

    @Override
    public String toString() {
        return nome + "\n" + matricula + "\n" + telefone + "\n" + email + "\n" + uffmail + "\n" + status;
    }
}
