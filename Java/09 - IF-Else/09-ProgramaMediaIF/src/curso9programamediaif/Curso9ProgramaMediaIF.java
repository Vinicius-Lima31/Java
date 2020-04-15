package curso9programamediaif;

import java.util.Scanner;


public class Curso9ProgramaMediaIF 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite Primeira Nota: ");
        float n1 = teclado.nextFloat();
        
        System.out.println("\nDigite Segunda Nota: ");
        float n2 = teclado.nextFloat();
        
        float m = (n1 + n2) / 2;
        System.out.println("\n" + m);
        
        if(m >= 9)
            System.out.println("\nParabéns\n");
    }
    
}
