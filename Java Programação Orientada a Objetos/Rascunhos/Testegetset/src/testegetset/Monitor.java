package testegetset;

public class Monitor 
{
    private String marca;
    private String cor;
    private float polegadas;
    private boolean ligada = false;
    private boolean internet;
    
   
    public void status()
    {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Polegadas: " + this.getPolegadas());
        System.out.println("Ligada: " + this.getLigada());
        System.out.println("Possui Conexão com Internet: " + this.getInternet());
    }
    
    public void setMarca(String m)
    {
        this.marca = m;
    }
    public String getMarca()
    {
        return this.marca;
    }
    public void setCor(String c)
    {
        this.cor = c;
    }
    public String getCor()
    {
        return this.cor;
    }
    public void setPolegadas(float p)
    {
        this.polegadas = p;
    }
    public float getPolegadas()
    {
        return this.polegadas;
    }
    public boolean getLigada() 
    {
        return ligada;
    }
    public void setLigada(boolean ligada) 
    {
        this.ligada = ligada;
    }
    public boolean getInternet() 
    {
        return internet;
    }
    public void setInternet(boolean internet) 
    {
        this.internet = internet;
    }
    
}
