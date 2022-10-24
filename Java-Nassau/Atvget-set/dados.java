public class dados {
    //atributos-modificador de acessos, tipo, nome
    private int idade;
    private String nome;

    //metodos
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if(nome.isEmpty()){
            this.nome = "Não informado";
        }else{
            this.nome = nome;
        }
       
    }
}
