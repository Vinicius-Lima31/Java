package curso14vetor05preenchendovetor;

import java.util.Arrays;

public class Curso14Vetor05PreenchendoVetor 
{

    public static void main(String[] args) 
    {
        int v [] = new int[20];
        Arrays.fill(v, 0);
        
        for(int valor: v)
        {
            System.out.print(valor + " ");
        }
    }
    
}
