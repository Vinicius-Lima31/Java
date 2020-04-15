package curso04bcontructor;

public class Curso04bContructor 
{
    public static void main(String[] args) 
    {
        Caneta c1 = new Caneta("BIC", 0.7f);
        Caneta c2 = new Caneta("COMPACTOR", 0.9f);
        c1.status();
        c2.status();
        
    }
    
}
