package tabuada;

import java.util.Scanner;

public class Tabuada 
{

    public static void main(String[] args) 
    {
       tabuadavezes tb = new tabuadavezes();
       Scanner input = new Scanner(System.in);
       System.out.print("Digite um Número: ");
       int n1 = input.nextInt();
       
       tb.tabSet(n1);
        System.out.print(tb.tabGet());
    }
    
}
