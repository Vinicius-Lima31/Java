package contructor;

public class caderno 
{
    private int materias;
    private String marca;
    private int folhas;
    private String tema;
    
    public caderno(String m, String t, int f, int mat)
    {
        this.marca = m;
        this.tema = t;
        this.getMaterias();
        this.getFolhas();
    }

    public String getMarca() 
    {
        return marca;
    }

    public String getTema() 
    {
        return tema;
    }
    

    public int getFolhas() 
    {
        return folhas;
    }

    public int getMaterias() 
    {
        return materias;
    }
    
}
