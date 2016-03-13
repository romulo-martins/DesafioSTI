/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliares;

/**
 *
 * @author Romulo
 */
public class SenhaManager {

    public static String gerarSenha(int maxCaracteres) {

        String[] caracteres = {"0" ,"1", "2", "3", "4", "5", "6", "7", "8", "9",
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
            "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
            "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
            "V", "W", "X", "Y", "Z"};

        String senha = "";

        for (int i = 0; i < maxCaracteres; i++) {
            int posicao = (int) (Math.random() * caracteres.length);
            senha += caracteres[posicao];
        }
        
        return senha;
    }    
    
//    public static void main(String[] args) {
//        for(int i = 0; i < 10; i++) {
//            System.out.println(executar());
//        }
//    }

}
