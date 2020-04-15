package curso15testefuncao02;


public class Operacoes 
{
    public static String contador(int i, int f)
    {
        String s = "";
        
        for (int c = 1; c <= f; c++)
            s+= c + " ";
        
        return s;
    }
}
