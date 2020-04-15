package curso13bpolimorfismoparte2;

public class Mamifero extends Animal // herança
{
    protected String corPelo;

    @Override   // sobrepor
    public void emitirSom() /// sobrepondo o metodo emitirSom
    {
        System.out.println("Som de Mamífero");
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
