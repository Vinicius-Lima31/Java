package curso08bagregacaoentreobjetoslutador;

public class Lutador 
{
    // Atributos
    private String nome, nacionalidade;
    private int idade;
    private float altura, peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    
    // Métodos Públicos
    public void apresentar()
    {
        System.out.println("---------------------------------");
        System.out.println("Lutador " + this.getNome());
        System.out.println("Diretamente do " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos");
        System.out.println("Pesando " + this.getPeso());
        System.out.println(this.getVitorias() + " Vítorias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates()+ " Empates");
    }
    public void status()
    {
        System.out.println(this.getNome() + " É um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias());
        System.out.println("Empatou " + this.getEmpates());
        System.out.println("Derrotas " + this.getDerrotas());
    }
    public void ganharLuta()
    {
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta()
    {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta()
    {
        this.setEmpates(this.getEmpates() + 1);
    }
    // Métodos Especias

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) 
    {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);   //setPeso porque ele acessara o Método Set e dentro do Método set ele acessara o setCategoria
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    public String getNacionalidade() 
    {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) 
    {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() 
    {
        return idade;
    }
    public void setIdade(int idade) 
    {
        this.idade = idade;
    }
    public float getAltura() 
    {
        return altura;
    }
    public void setAltura(float altura) 
    {
        this.altura = altura;
    }
    public float getPeso() 
    {
        return peso;
    }
    public void setPeso(float peso) 
    {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() 
    {
        return categoria;
    }
    public void setCategoria() 
    {
        if(this.peso < 52.2)
            this.categoria = "Invalido";
        else if(this.peso <= 70.3)
            this.categoria = "Leve";
        else if(this.peso <= 83.9)
            this.categoria = "Médio";
        else if(this.peso <= 120.2)
            this.categoria = "Pesado";
        else
            this.categoria = "Invalido";
            
    }
    public int getVitorias() 
    {
        return vitorias;
    }
    public void setVitorias(int vitorias) 
    {
        this.vitorias = vitorias;
    }
    public int getDerrotas() 
    {
        return derrotas;
    }
    public void setDerrotas(int derrotas) 
    {
        this.derrotas = derrotas;
    }
    public int getEmpates() 
    {
        return empates;
    }
    public void setEmpates(int empates) 
    {
        this.empates = empates;
    }
}
