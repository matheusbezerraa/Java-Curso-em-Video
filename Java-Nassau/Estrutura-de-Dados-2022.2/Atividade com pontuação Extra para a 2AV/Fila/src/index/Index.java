/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

/**
 *
 * @author Matheus Bezerra
 */
public class Index {
    public static void main(String[] args) {
        fila fila = new fila();
        
        fila.adicionar("Osvaldo");
        fila.adicionar("Zé");
        fila.adicionar("Matheus");
        fila.adicionar("Maria");
        fila.adicionar("Miguel");
        
        System.out.println("Primeiro da fila: " + fila.get());
        
        fila.remover();
        
        System.out.println("Novo Primeiro da fila: " + fila.get());
        
        fila.remover();
        
        System.out.println("Novo Primeiro da fila: " + fila.get());
        
    }
}
    

