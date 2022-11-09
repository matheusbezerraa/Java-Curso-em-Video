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
public class fila {
    private ListaLigada lista;
    
    public fila(){
        this.lista = new ListaLigada();
    }
    
    public void adicionar(String novoValor){
        this.lista.adicionar(novoValor);
    }
    public void remover(){
        this.lista.remover(this.get());
    }
    public String get(){
        return this.lista.getPrimeiro().getValor();
    }
    
}
