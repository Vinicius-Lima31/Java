package model.bean;

public class Categoria 
{
    
    private int id;
    private String descricao;

    public Categoria() // Construtor Vazio
    {
        // uma sobreCarga, um Construtor vai obrigar a passar valores e outro não
    }

    public Categoria(String descricao) // Construtor que passa, sem id
    {
        this.descricao = descricao;
    }
    
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getDescricao() 
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }
    
}
