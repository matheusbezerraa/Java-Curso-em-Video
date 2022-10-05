/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhaskara;

import java.util.Scanner;

/**
 *
 * @author Matheus Bezerra
 */
public class Delta {
    
    Scanner read = new Scanner(System.in);
    
    
    int a, b, c;
    double delta, x1, x2;
 
    public Delta() {
        deltaCalculo();
    }
 
    private void deltaCalculo() {
 
        System.out.println("Digite o valor de A, B e C respectivamente: ");
        a = Integer.parseInt(read.next());
        b = Integer.parseInt(read.next());
        c = Integer.parseInt(read.next());
 
        delta = (b * b) + (-4 * (a * c));
 
        System.out.println("Delta: " + delta);
 
        if (delta >= 0) {
            calculaX();
        } else {
            System.out.println("Delta nÃ£o possui raiz!");
            System.exit(0);
        }
 
    }
 
    private void calculaX() {
 
        x1 = (double) ((-(b) + Math.sqrt(delta)) / 2 * a);
        x2 = (double) ((-(b) - Math.sqrt(delta)) / 2 * a);
 
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
 
    }
}
