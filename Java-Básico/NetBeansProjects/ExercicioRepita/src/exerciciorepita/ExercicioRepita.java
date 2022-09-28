/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author Matheus Bezerra
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        int n, s=0, i=0;
        do{
          n = Integer.parseInt(JOptionPane.showInputDialog(null,"informe um numero: (o valor 0 interrompe)"));  
          s+=n;
   
        }while(n != 0);
      JOptionPane.showMessageDialog(null,"resultado final ---->" +"somatorio vale: "+ s);
       
    }
    
}
