/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author 01523854
 */
public class Funcionario {
    public String nome;
    public int cpf;
    public double salario;
    
    public void Calcular(){
        salario = salario*2;
        System.out.println("seu salaio "+ salario);
    }
    
}
