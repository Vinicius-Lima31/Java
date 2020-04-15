package estudometodos;

public class Experimento 
{
    private int q;
    
    public void setQuad(int n)
    {
        n *= n;
        q = n;
    }
    
    public int getQuad()
    {
        return q;
    }
}
