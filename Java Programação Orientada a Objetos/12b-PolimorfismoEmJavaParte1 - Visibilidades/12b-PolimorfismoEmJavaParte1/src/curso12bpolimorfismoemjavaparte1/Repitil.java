package curso12bpolimorfismoemjavaparte1;

public class Repitil extends Animal
{
    private String CorEscama;
    
    @Override
    public void locomover() 
    {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() 
    {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom() 
    {
        System.out.println("Som de Repitil");
    }

    public String getCorEscama() 
    {
        return CorEscama;
    }

    public void setCorEscama(String CorEscama) 
    {
        this.CorEscama = CorEscama;
    }
    
}
