package curso13bpolimorfismoparte2;

public class Cachorro extends Lobo
{
    @Override
    public void emitirSom()
    {
        System.out.println("Au Au");
    }
    
    public void reagir(String frase)
    {
        if(frase.equals("Ola"))
            System.out.println("Abanar e latir");
        else    
            System.out.println("Rosnar");
    }  
    
    public void reagir(int hora, int min)
    {
        if(hora < 12)
            System.out.println("Abanar");
        else if(hora >= 18)
            System.out.println("Ignorar");
            else
                System.out.println("Abanar e latir");
    }
    
    public void reagir(boolean dono)
    {
        if(dono)
            this.emitirSom(); // chamei o método
        else
        {
            System.out.println("Rosnar");
            super.emitirSom(); // usando o método da classe PAI, classe lobo
            // Auuuuuuu! Auuuuuuu!
        }
    }
    
    // LEMBRANDO QUE A ASSINATURA É A QUANTIDADE E O TIPO DE PARAMETROS
    
}
