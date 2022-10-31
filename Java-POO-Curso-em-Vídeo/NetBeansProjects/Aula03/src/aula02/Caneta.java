/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author Matheus Bezerra
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("modelo: "+ this.modelo);
        System.out.println("uma caneta "+ this.cor);
        System.out.println("ponta: "+ this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("está tampada? "+ this.tampada);
        
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("erro!! nao posso rabiscar");
        }else{
            System.out.println("estou rabiscando");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
