package curso12bpolimorfismoemjavaparte1;

public class Ave extends Animal     // ave é filho de animal, herança
{
    private String corPena;
    
    @Override   // sobrepor
    public void locomover() 
    {
        System.out.println("Voando"); 
    }

    @Override
    public void alimentar() 
    {
        System.out.println("Comendo Frutaas");
    }

    @Override
    public void emitirSom() 
    {
        System.out.println("Som de Ave");
    }
    public void fazerNinho()
    {
        System.out.println("Construindo Ninho");
    }

    public String getCorPena() 
    {
        return corPena;
    }

    public void setCorPena(String corPena) 
    {
        this.corPena = corPena;
    }
        
}
