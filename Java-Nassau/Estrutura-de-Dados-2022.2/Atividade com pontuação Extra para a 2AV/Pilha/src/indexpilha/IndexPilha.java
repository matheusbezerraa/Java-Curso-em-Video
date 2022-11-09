/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexpilha;

/**
 *
 * @author Matheus Bezerra
 */
public class IndexPilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pilha pilha = new Pilha();
        
        pilha.adicionar("Osvaldo");
        pilha.adicionar("Zé");
        pilha.adicionar("Matheus");
        pilha.adicionar("Maria");
        pilha.adicionar("Miguel");
        
        System.out.println("Topo: " + pilha.get());
        
        pilha.remover();
        
        System.out.println("Novo Topo: " + pilha.get());
        
        pilha.remover();
        
        System.out.println("Novo Topo: " + pilha.get());
    }
    
}
