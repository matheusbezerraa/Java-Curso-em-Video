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
public class Pilha {
    private Lista lista;
    
    public Pilha(){
        this.lista = new Lista();
    }
    
    public void adicionar(String novoValor){
        this.lista.adicionarComeco(novoValor);
    }
    
    public void remover(){
        this.lista.remover(this.get());
    }
    
    public String get(){
        return this.lista.getPrimeiro().getValor();
    }
}