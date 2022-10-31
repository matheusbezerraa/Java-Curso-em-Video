import javax.swing.JOptionPane;

public class index {
    public static void main(String[] args) {
        dados entrada = new dados();
        entrada.setNome(JOptionPane.showInputDialog(null, "digite seu nome: "));
        entrada.setN1(Double.parseDouble(JOptionPane.showInputDialog(null, "digite n1")));
        entrada.setN2(Double.parseDouble(JOptionPane.showInputDialog(null, "digite n2")));

        JOptionPane.showMessageDialog(null, entrada.getNome() + " sua primeira nota foi: " +entrada.getN1() +" sua segunda nota foi: "+entrada.getN2()+" sua média final foi: "+ entrada.Calcular(), null, 0);


    }

}    