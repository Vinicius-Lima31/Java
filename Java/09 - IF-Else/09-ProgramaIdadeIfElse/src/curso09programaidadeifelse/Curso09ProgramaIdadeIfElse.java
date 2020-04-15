package curso09programaidadeifelse;

import java.util.Scanner;


public class Curso09ProgramaIdadeIfElse 
{

    
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu Ano de Nascimento: ");
        int nasc = teclado.nextInt();
        int i = 2020 - nasc ;
        System.out.println("Sua Idade é = " + i);
        
        if(i > 18)
        {
            System.out.println("\nMaior de Idade");
        }
        else
        {
            System.out.println("\nMenor de Idade");
        }
    }
}
