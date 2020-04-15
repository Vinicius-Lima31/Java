package curso11contador01while;

public class Curso11Contador01While 
{
    public static void main(String[] args) 
    {
        int cc = 1;
        while (cc < 10)
        {
            cc++;
            if(cc == 1)
                continue;
            System.out.println("Cambalhota = " + cc);
        }
        
        cc = 1;
        while(20 > cc)
        {
            if(cc == 5)
                break;
            System.out.println("Mortal = " + cc);
            cc++;
        }
    }
    
}
