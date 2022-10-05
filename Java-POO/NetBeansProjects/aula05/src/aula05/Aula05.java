
package aula05;


public class Aula05 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(11111);
        p1.setDono("Matheus");
        p1.abrirConta("cc");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(22222);
        p2.setDono("Creuza");
        p2.abrirConta("cp");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(200);
        
        
        p1.estadoAtual();
        p2.estadoAtual();
       
    }
    
}
