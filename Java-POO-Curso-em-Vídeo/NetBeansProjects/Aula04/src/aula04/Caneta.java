
package aula04;

/**
 *
 * @author Matheus Bezerra
 */
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean  tampada;
    private String cor;
    
    //ctrl + i constroi o codigo pra você
    
    public Caneta(String m, String c, float p) { //este é o metodo construtor
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        
    }
    
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
    public void status() {
        System.out.println("sobre a caneta: ");
        System.out.println("modelo: "+ this.getModelo());
        System.out.println("ponta: "+ this.getPonta());
        System.out.println("cor: "+ this.cor);
        System.out.println("tampada: "+ this.tampada);
    }
}
