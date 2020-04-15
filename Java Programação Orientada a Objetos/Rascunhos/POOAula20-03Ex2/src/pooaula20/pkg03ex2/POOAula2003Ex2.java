package pooaula20.pkg03ex2;
import java.util.Scanner;
public class POOAula2003Ex2 
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        float av1[] = new float[5];
        float av2[] = new float[5];
        float m1 = 0, m2 = 0;
        
        System.out.println("Notas AV1");
        for(int c = 0; c < av1.length; c++)
        {
            System.out.print("(AV1) Digite " + (c + 1) + "° = " );
            av1[c] = ler.nextFloat();
            m1 += av1[c];
        }
        System.out.println();
        
        for(int c = 0; c < av2.length; c++)
        {
            System.out.print("(AV2) Digite " + (c + 1) + "° = " );
            av2[c] = ler.nextFloat();
            m2 += av2[c];
        }
        System.out.println();
        System.out.printf("Média AV1 = %.1f", (m1 / av1.length));
        System.out.printf("\nMédia AV2 = %.1f", (m2 / av2.length));
        System.out.println();
    }
}
