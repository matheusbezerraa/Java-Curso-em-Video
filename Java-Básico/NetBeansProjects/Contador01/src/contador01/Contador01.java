
package contador01;

/**
 *
 * @author Matheus Bezerra
 */
public class Contador01 {

    
    public static void main(String[] args) {
        int cc= 0;
        while (cc<10){
            cc++;
            if(cc==2 || cc==3){
                continue;//modifica o fluxo
            }
            if (cc==7){
                break;//interrompe o codigo
            }
            System.out.println("cambalhota "+ cc);
            
        }
        
        
        
        
    }
    
    
}
