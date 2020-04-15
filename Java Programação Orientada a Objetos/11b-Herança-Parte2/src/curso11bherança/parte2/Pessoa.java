package curso11bherança.parte2;

public abstract class Pessoa // Não pode ser "Instanciada"
{
    protected String nome;  // Significa que não preciso usar get
    protected int idade;    // Posso acessar assim this.idade em suas subclasses
    protected String sexo;  // Protected é para isso, Minuto 10:20
    
    public void fazerAniversario()
    {
        this.setIdade(this.getIdade() + 1);
    }

    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    public int getIdade() 
    {
        return idade;
    }
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    public String getSexo() 
    {
        return sexo;
    }
    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    @Override
    public String toString() 
    {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
}
