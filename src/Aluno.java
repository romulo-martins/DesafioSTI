
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
        
    
    @Override
    public String toString() {
        return nome + "\n" +  matricula + "\n" + telefone + "\n" + email + "\n" + uffmail + "\n" + status;
    }
}
