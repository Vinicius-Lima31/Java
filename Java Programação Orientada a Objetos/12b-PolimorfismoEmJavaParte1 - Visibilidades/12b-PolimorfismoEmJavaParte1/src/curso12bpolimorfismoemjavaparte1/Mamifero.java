package curso12bpolimorfismoemjavaparte1;

public class Mamifero extends Animal    
{
    private String corPelo; // Atributo
    
    // Polimorfismo
    @Override       // sobrepor
    public void locomover() 
    {
        System.out.println("Correndo");
    }

    @Override       // sobrepor
    public void alimentar() 
    {
        System.out.println("Mamando");
    }

    @Override       // sobrepor
    public void emitirSom() 
    {
        System.out.println("Som de Mamifero");
    }

    public String getCorPelo() 
    {
        return corPelo;
    }

    public void setCorPelo(String corPelo) 
    {
        this.corPelo = corPelo;
    }
    
    
    
}
