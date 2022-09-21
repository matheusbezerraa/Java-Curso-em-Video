
package numeros;

import java.util.Scanner;

/**
 *
 * @author Matheus Bezerra
 */
public class Numeros {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int s=0, n;
        String resp;
        Scanner teclado = new Scanner(System.in);
        
        do{
          System.out.println("digite um numero: ");
          n = teclado.nextInt();
          s += n;
          System.out.println("quer continuar? [S/N] ");
          resp = teclado.next();
        }while(resp.equals("S"));
        System.out.println("a soma de todos os valores é "+ s);
    }
    
}
