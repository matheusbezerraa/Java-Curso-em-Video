package encapsular;

import javax.swing.JOptionPane;

public class Encapsular {

    public static void main(String[] args) {
        Calcular dados = new Calcular();      
        //Envia o dados
        dados.setNome(JOptionPane.showInputDialog("Digite seu nome"));
        if(dados.getNome().isEmpty()){
           JOptionPane.showMessageDialog(null,"O nome é obrigatório");
        }else{
            dados.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota")));
            dados.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota")));
            //Recebe o dado
            JOptionPane.showMessageDialog(null, dados.getNome() + " tirou na 1 nota: " + dados.getN1() + " tirou na 2 nota: " + dados.getN2() + " e obteve a média: " + dados.Resultado());
        }

    }
    
}
