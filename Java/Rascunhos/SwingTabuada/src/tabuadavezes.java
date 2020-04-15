


public class tabuadavezes 
{
    private String t = "";
    public void tabSet(int n)
    {
        String s;
        for(int c = 1; c <=10; c++)
        {
            t += n + " x " + c + " = " + n * c + "\n";
        }
        
    }
    
    public String tabGet()
    {
         return t;
    }
}
