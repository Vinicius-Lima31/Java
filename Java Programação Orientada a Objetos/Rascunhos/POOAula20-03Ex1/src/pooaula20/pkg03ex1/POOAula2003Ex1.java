package pooaula20.pkg03ex1;

import java.util.Scanner;

public class POOAula2003Ex1 
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu Nome: ");
        String nome = ler.nextLine();
        
        System.out.print("Digite sua Nota da AV1: ");
        float av1 = ler.nextFloat();
        
        System.out.print("Digite sua Nota da AV2: ");
        float av2 = ler.nextFloat();
        System.out.println();
        
        float media = (av1 + av2) / 2;
        System.out.println("Nome: " + nome);
        System.out.println("Média = " + media);
        
    }
}
