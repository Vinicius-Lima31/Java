package curso12dowhileesquals;

import java.util.Scanner;

public class Curso12DoWhileEsquals 
{

    public static void main(String[] args) 
    {
        int s = 0, n = 0;
        String resp;
        Scanner imput = new Scanner(System.in);
        
        do
        {
            System.out.println("Digite um Número: ");
            n = imput.nextInt();
            s += n;
            System.out.println("Quer Continuar ?");
            resp = imput.next();
        } while (resp.equals("S"));
        
        System.out.println("\nA soma de tudo é = " + s);
    }
    
}
