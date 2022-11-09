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
public class elemento{
    private String valor;
    private elemento proximo;
    
    public elemento( String novoValor){
        this.valor = novoValor;
    }
    
    public String getValor(){
        return valor;
    }
    public void setValor(String valor){
        this.valor = valor;
    }
    public elemento getProximo(){
        return proximo;
    }
    public void setProximo(elemento proximo){
        this.proximo = proximo;
    }
}
