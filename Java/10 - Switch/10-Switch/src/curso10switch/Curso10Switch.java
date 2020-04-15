package curso10switch;

import java.util.Scanner;

public class Curso10Switch 
{

    public static void main(String[] args) 
    {
        
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas Pernas: ");
        int perna = tec.nextInt();
        String tipo;
        
        System.out.print("Isso é um (a) ");
        switch(perna)
        {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6 :
            case 8 :
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        
        System.out.println(tipo);
    }
    
}
