package model.bean;

public class Produto 
{
    
    private int id;
    private String descricao;
    private int qtd;
    private double valor;
    private Categoria categoria; // Vamos relacionar

    public Produto() // Constructor
    {
        // Um Constructor vai obrigar a passar parametros e outro não
    }

    public Produto(String descricao, double valor, Categoria categoria) 
    {
        //Constructor
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
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

    public int getQtd() 
    {
        return qtd;
    }

    public void setQtd(int qtd) 
    {
        this.qtd = qtd;
    }

    public double getValor()
    {
        return valor;
    }

    public void setValor(double valor) 
    {
        this.valor = valor;
    }

    public Categoria getCategoria() 
    {
        return categoria;
    }

    public void setCategoria(Categoria categoria) 
    {
        this.categoria = categoria;
    }
    
    
    
}
