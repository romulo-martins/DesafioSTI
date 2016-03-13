/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

import java.io.*;
import java.util.*;

/**
 *
 * @author Romulo
 */
public class AlunoManager {

    // este método simula o envio de SMS para um determinado aluno, na verdade é criado um arquivo 
    // com uma mensagem de senha provisória
    public static boolean enviarSMS(Aluno aluno) {
        String arquivo = aluno.uffmail + ".txt";

        // Cria um arquivo em "UTF-8" com a mensagem do SMS
        try (Formatter saida = new Formatter(arquivo, "UTF-8")) {
            saida.format("Olá %s, sua senha provisória é %s, entre "
                    + "no seu uffmail para redefini-la.", aluno.getPrimeiroNome(), aluno.senha);
            saida.flush();
        } catch (UnsupportedEncodingException | FileNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    // Neste método deduzi que todos os nomes irão vir no padrão primeiroNome + segundoNome + terceiroNome, como mostra no arquivo csv
    public static List<String> opcoesEmail(Aluno aluno) {
        List<String> listaDeEmails = new ArrayList<>();
        String email = "@id.uff.br";

        try {

            String[] nomes = aluno.nome.split(" ");
            String primeiroNome = nomes[0].toLowerCase();
            String segundoNome = nomes[1].toLowerCase();
            String terceiroNome = nomes[2].toLowerCase();

            listaDeEmails.add(primeiroNome + "_" + segundoNome + email); // ex: laura_azevedo@id.uff.br
            listaDeEmails.add(primeiroNome + segundoNome.charAt(0) + terceiroNome.charAt(0) + email); // ex: lauraac@id.uff.br
            listaDeEmails.add(primeiroNome + terceiroNome + email);// ex: lauracunha@id.uff.br
            listaDeEmails.add(primeiroNome.charAt(0) + terceiroNome + email); // lcunha@id.uff.br
            listaDeEmails.add(primeiroNome.charAt(0) + segundoNome + terceiroNome + email); //lazevedocunha@id.uff.br

        } catch (Exception e) {
            System.out.println("Erro ao tentar gerar as opções de emails! tente novamente");
        }

        return listaDeEmails;
    }

}
