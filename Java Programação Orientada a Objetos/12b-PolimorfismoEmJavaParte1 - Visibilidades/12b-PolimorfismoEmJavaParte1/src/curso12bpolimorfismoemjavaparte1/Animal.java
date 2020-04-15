package curso12bpolimorfismoemjavaparte1;

public abstract class Animal // tem que ser abstrato também
{
    // Atributos
    protected float peso;
    protected int idade;
    protected int membros;
    
    // Métodos de animal
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() 
    {
        return peso;
    }

    public void setPeso(float peso) 
    {
        this.peso = peso;
    }

    public int getIdade() 
    {
        return idade;
    }

    public void setIdade(int idade) 
    {
        this.idade = idade;
    }

    public int getMembros() 
    {
        return membros;
    }

    public void setMembros(int membros) 
    {
        this.membros = membros;
    }
    
}
