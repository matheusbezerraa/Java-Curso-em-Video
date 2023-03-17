
package aula02;

/**
 *
 * @author Matheus Bezerra
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("modelo: "+ this.modelo);
        System.out.println("cor da caneta: "+ this.cor);
        System.out.println("ponta: "+ this.ponta);
        System.out.println("carga: " + this.carga + "%");
        System.out.println("está tampada? "+ this.tampada);
        
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("erro!! nao posso rabiscar");
        }else{
            System.out.println("estou rabiscando");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
