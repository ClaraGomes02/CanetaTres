/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage3;
import java.util.Scanner; //Importe de Scanner.

/**
 *
 * @author clara
 */
public class Caneta3 {
    
    Scanner teclado = new Scanner(System.in);
    
    private String modelo; //Predefinido em "getModelo()".
    private String cor; //Será escolhido pelo usuário.
    private int ponta; //Será escolhido pelo usuário.
    private int carga; //Predefinido em "getCarga()".
    private boolean tampada; //Predefinido em "getTampa()".
    
    private String perguntaUm;
    
    public void especificacoes(){
        
        System.out.println("Escolha a cor:");
        this.cor = teclado.next(); //O texto digitado pelo usuário será inserido em "this.cor".
        System.out.println("Escolha o tamanho da ponta: ");
        this.ponta = teclado.nextInt(); //O texto digitado pelo usuário será inserido em "this.ponta".
        
    }
    
    public void propriedades(){
        
        System.out.println("Modelo: "+this.getModelo()); //"this.getModelo" irá pegar os dados armazenados em c1 (this).
        System.out.println("Cor: "+this.getCor()); //"this.getCor" irá pegar os dados armazenados em c1 (this).
        System.out.println("Ponta: "+this.getPonta()); //"this.getPonta" irá pegar os dados armazenados em c1 (this).
        System.out.println("Carga: "+this.getCarga()); //"this.getCarga" irá pegar os dados armazenados em c1 (this).
        
    }
    
    public void perguntaUm(){
        
        System.out.println("");
        
        System.out.println("Gostaria de receber as propriedades da sua caneta?");
        this.perguntaUm = teclado.next(); //"this.perguntaUm" irá pegar os dados armazenados em c1 (this).
        
        if ("Sim".equals(perguntaUm)){ //Se "perguntaUm" for igual a "Sim":
            
            System.out.println("");
            
            this.propriedades();
            
            System.out.println("");
            
            System.out.println("Obrigada.");
            
        }else{ //Se não:
        
            System.out.println("Obrigada pela preferência.");
            
        }
        
    }

    public String getModelo() {
        return modelo = "BIC"; //Predefinido.
    }

    public void setModelo(String modelo) {
        this.modelo = modelo; //Predefinido.
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(int ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga = 4; //Predefinido.
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public boolean getTampada(boolean tampada){
        
        return tampada = true; //Predefinido que a caneta está tampada.
    }
    
    public void setTampada(boolean tampada) {
        this.tampada = tampada; //O tampada de c1 (this.tampada) será "true" pois é igual a "tampada" que foi predefinido no getTampada anterior.
    }
    
    public void rabiscar(){
        
        if (getTampada(tampada) == true){ //Se "getTampada" retorna "tampada" como "true", então:
            
            System.out.println("Tampa fechada... não posso rabiscar.");
            
        }else{ //Se não:
            
            System.out.println("Rabiscando~~~");
            
        }
        
    }
    
}
