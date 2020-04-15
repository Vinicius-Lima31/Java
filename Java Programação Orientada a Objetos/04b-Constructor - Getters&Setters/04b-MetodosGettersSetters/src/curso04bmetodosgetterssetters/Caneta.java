package curso04bmetodosgetterssetters;

public class Caneta 
{
    public String modelo;
    private float ponta;
    public String getModelo()
    {
        return this.modelo;
    }
    public void setModelo(String m)
    {
       this.modelo = m; 
    }
    public float getPonta()
    {
        return this.ponta;
    }
    public void setPonta(float p)
    {
        this.ponta = p;
    }
    public void status()
    {
        //System.out.println(this.modelo);
        //System.out.println(this.ponta);
        System.out.println(this.getModelo());
        System.out.println(this.getPonta());
    }
}
