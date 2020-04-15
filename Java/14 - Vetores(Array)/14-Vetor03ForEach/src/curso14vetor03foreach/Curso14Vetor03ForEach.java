package curso14vetor03foreach;

import java.util.Arrays;

public class Curso14Vetor03ForEach 
{

    public static void main(String[] args) 
    {
      double v [] = {4.5, 9.8, 4.84, -9.3, 2};
      
      Arrays.sort(v);
      for(double valor: v)
            System.out.println(valor);
    }
    
}
