
package ads;

import javax.swing.JOptionPane;

public class Professor {
    
    public String nome;
    public float v1;
    public float v2;
    public float r;
    
    public void resultado(){
       
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota: "));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota: "));
        
        r = (v1 + v2)/2;

        if(r >= 7){
            JOptionPane.showMessageDialog(null,"O resultado do aluno: " + nome + "=" + " " + r);
        }else if(r >= 4 && r < 7){
            System.out.println("Aluno em recuperação");
        }else{
            System.out.println("Aluno reprovado");
        }
    
    }

}
