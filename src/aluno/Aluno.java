package aluno;

/**
 *
 * @author Romulo
 */
public class Aluno {

    //LEMBRETE : encapsular os atributos da classe
    // os atributos da classe aluno ficaram sem encapsulamento para simplificar o codigo, 
    // sem ter que por um monte de getters e setters
    public String nome;
    public String matricula;
    public String telefone;
    public String email;
    public String uffmail;
    public String status;
    
    public String senha;

    // construtor sem atributos
    public Aluno() { }
    
    // construtor com atributos
    public Aluno(String nome, String matricula, String telefone, String email, String uffmail, String status) {
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
        this.email = email;
        this.uffmail = uffmail;
        this.status = status;
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
