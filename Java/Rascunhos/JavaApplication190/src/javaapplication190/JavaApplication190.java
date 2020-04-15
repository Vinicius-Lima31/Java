/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication190;

/**
 *
 * @author FalaZezeBomDiaCara
 */
public class JavaApplication190 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1 = 5.96;
        int n2 = (int) (Math.round(n1));
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        short n3 = (short) n1;
        System.out.println("n3 = " + n3);
        n3 = 32766;
        n3++;
        n3++;
        // Maximo de whort é 32767
        System.out.println("n3 = " + n3);
    }
    
}
