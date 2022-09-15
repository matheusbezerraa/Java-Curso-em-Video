/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidadaif;

import java.util.Scanner;

/**
 *
 * @author lene_
 */
public class ProgramaIdadaIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner t = new Scanner(System.in);
        
        System.out.println("escreva seu ano de nascimento: ");
        int nasc = t.nextInt();
        int i = 2022 - nasc;
        System.out.println(i);
        
        if(i>=18){
            System.out.println("maior de idade");
        }else{
            System.out.println("menor de idade");
        }
    }
    
}
