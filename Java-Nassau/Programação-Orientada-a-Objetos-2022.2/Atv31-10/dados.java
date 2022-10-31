public class dados {
    //atributos
    public String nome;
    public int idade;
    public double n1, n2, resultado;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if(nome.isEmpty()){
            this.nome = "Digite seu nome por favor";
        }else{
            this.nome = nome;
        }
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public double getN1(){
        return n1;
    }
    public void setN1(double n1){
        if(n1>0){
            
        }
        this.n1 = n1;
    }
    public double getN2(){
        return n2;
    }
    public void setN2(double n2){
        this.n2 = n2;
    }
    public double Calcular(){
        resultado = (this.n1 + this.n2)/ 2;
        return resultado;
    }

}
