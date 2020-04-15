
package primeiroprograma;

import java.util.Date;
import java.util.Locale;

public class PrimeiroPrograma
{

    public static void main(String[] args) 
    {
        Date relogio = new Date();
        System.out.println("A hora do Sistema é:");
        System.out.println(relogio.toString());
        
        Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayLanguage()); // imprime "Português"
        System.out.println(loc.getLanguage()); // imprime "pt"
        
    
    }

}