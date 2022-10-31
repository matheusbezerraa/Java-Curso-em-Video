/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author Matheus Bezerra
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {3.5,2,5,7};
        Arrays.sort(v); //para deixar em ordem crescente
        for(double valor: v)
            System.out.println(valor);        
    }
    
}
