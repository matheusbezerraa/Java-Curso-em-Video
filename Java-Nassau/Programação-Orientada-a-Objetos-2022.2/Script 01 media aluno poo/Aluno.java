
package ads;

import java.util.Scanner;

public class Aluno {
    public String nome;
    public float v1;
    public float v2;
    public float r;
    
    public void resultado(){
       
        Scanner dados = new Scanner(System.in);
            
        System.out.println("Digite seu nome: ");
        nome = dados.next();
        
        System.out.println("Digite a primeira nota: ");
        v1 = dados.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        v2 = dados.nextFloat();
        
        r = (v1 + v2)/2;

        if(r >= 7){
            System.out.println("Aluno aprovado");
            
        }else if(r >= 4 && r < 7){
            System.out.println("Aluno em recuperação");
        }else{
            System.out.println("Aluno reprovado");
        }
    }
}
