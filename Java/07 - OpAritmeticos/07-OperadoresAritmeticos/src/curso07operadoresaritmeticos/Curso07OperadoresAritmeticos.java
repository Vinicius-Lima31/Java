/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso07operadoresaritmeticos;

import java.util.Scanner;

/**
 *
 * @author FalaZezeBomDiaCara
 */
public class Curso07OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n1;
        int n2;
        System.out.println("Digite Primeira Nota: ");
        n1 = ler.nextInt();
        System.out.println("Digite Segunda Nota: ");
        n2 = ler.nextInt();
        
        float media = (n1 + n2) / 2;
        
        System.out.printf("\nMédia = %.2f\n\n", media);
        
        System.out.println("Raiz de 81 = " + Math.sqrt(81));
        System.out.println("Math.Round(6.2) = " + Math.round(6.2));
        System.out.println("Math.Round(5.6) = "+ Math.round(7.6));
        
        double ale = Math.random();
        System.out.printf("\nDouble Random = %f \nArredondando = %d\n\n", ale, (int)Math.ceil(ale));
        
        int n = (int)(1 + Math.random() * (100-1));
        System.out.println("Int Random = " + n);
        
    }
    
}
