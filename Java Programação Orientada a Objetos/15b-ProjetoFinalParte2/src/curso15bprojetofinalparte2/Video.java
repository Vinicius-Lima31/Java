package curso15bprojetofinalparte2;

public class Video implements AcoesVideo
{   // Atributoss
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) //  Contructor
    {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.reproduzindo = false;
    }
    
    // Metodos da Interface
    @Override
    public void play() 
    {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() 
    {
        this.setReproduzindo(false);
    }

    @Override
    public void like() 
    {
        this.curtidas ++;
    }

    public void setAvaliacao(int avaliacao) 
    {
        int nova;
        nova = (int)((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = avaliacao;
        // A média sempre sera calculada de acordo com Views
    }
    
    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public int getAvaliacao() 
    {
        return avaliacao;
    }

    public int getViews() 
    {
        return views;
    }

    public void setViews(int views) 
    {
        this.views = views;
    }

    public int getCurtidas() 
    {
        return curtidas;
    }

    public void setCurtidas(int curtidas) 
    {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() 
    {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) 
    {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() 
    {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
    
}
