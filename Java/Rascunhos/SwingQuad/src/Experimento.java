

public class Experimento 
{
    private int q;
    private int ip;
    
    public void setQuad(int n)
    {
        n *= n;
        q = n;
    }
    
    public void setImparPar(int n)
    {
        n %= 2;
        ip = n;
    }
    
    public int getQuad()
    {
        return q;
    }
    
    public String getImparPar()
    {
        if(ip == 0)
            return "Par";
        else
            return "Impar";
    }
}
