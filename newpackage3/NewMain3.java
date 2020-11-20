/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage3;

/**
 *
 * @author clara
 */
public class NewMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Caneta3 c1 = new Caneta3();
        
        System.out.println("******** NOVA CANETA ********");
        System.out.println("");
        
        c1.especificacoes(); //Chama o método "especificações" da caneta "c1".
        
        c1.perguntaUm(); //Chama o método "perguntaUm" da caneta "c1".

    }
    
}
