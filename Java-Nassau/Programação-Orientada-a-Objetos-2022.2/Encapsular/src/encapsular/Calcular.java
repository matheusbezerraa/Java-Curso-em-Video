package encapsular;

public class Calcular {
    //Atributos - Modificador de acesso, Tipo, Nome
    public String nome;
    private double n1, n2, resultado;
    //Métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
            this.nome = nome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double Resultado(){
           resultado = (this.n1 + this.n2) / 2;
           return resultado;
    }
    
}
