package comprafuncionarioteste;

public abstract class Pessoa
{
    protected String nome = "Fulano";
    protected int idade = 0;
    protected String sexo;
    
    public Pessoa(String n, int id, String s)
    {
        this.nome = n;
        this.idade = id;
        this.sexo = s;
    }

   
    @Override
    public String toString() 
    {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    public void falar()
    {
        System.out.println("...Falar...");
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

    public void setSexo(String genero) 
    {
        this.sexo = genero;
    }
    
}
