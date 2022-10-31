/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author lene_
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r ,s ,h ,m ;
        r = (x<y && y<z) ? true : false;
        s = (x<y && y==z) ? true : false; //e
        h = (x<y || y<z) ? true : false; //ou
        m = (x<y ^ y<z) ? true : false; //ou exclusivo
        System.out.println(r);
        System.out.println(s);
        System.out.println(h);
        System.out.println(m);
        
    }
    
}
