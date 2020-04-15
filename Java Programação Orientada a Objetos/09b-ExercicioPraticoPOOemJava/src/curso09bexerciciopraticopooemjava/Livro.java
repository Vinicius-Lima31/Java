package curso09bexerciciopraticopooemjava;

public class Livro implements Publicação
{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() // Inserir Código >> toString() 
    {   //toString Retorna uma String
        return "Livro{" + "titulo=" + titulo + "\n, autor="
                + autor + "\n, totPaginas=" + totPaginas
                + ", pagAtual=" + pagAtual + ", aberto=" 
                + aberto + "\n, leitor=" + leitor.getNome() + 
                ", idade=" + leitor.getIdade() +
                ", sexo=" + leitor.getSexo() + '}';
    }
    public void detalhes2()
    {
        System.out.println("Titulo " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de Paginas: " + this.getTotPaginas());
        System.out.println("Pagina Atual: " + this.getPagAtual());
        System.out.println("Livro está aberto? " + this.getAberto());
        System.out.println("Leitor: " + this.leitor.getNome());
    }
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) 
    {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }
    
    public String getTitulo() 
    {
        return titulo;
    }
    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }
    public String getAutor() 
    {
        return autor;
    }
    public void setAutor(String autor) 
    {
        this.autor = autor;
    }
    public int getTotPaginas() 
    {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) 
    {
        this.totPaginas = totPaginas;
    }
    public int getPagAtual() 
    {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) 
    {
        this.pagAtual = pagAtual;
    }
    public boolean getAberto() 
    {
        return aberto;
    }
    public void setAberto(boolean aberto) 
    {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() 
    {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) 
    {
        this.leitor = leitor;
    }

    @Override
    public void abrir() 
    {
        this.setAberto(true);
    }

    @Override
    public void fechar() 
    {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) 
    {
        if(p > this.totPaginas)
            this.setPagAtual(0);
        else
            this.setPagAtual(p);
    }

    @Override
    public void avancarPag() 
    {
        if(this.getPagAtual() >= this.getTotPaginas())
            this.setPagAtual(this.getTotPaginas());
        else
            this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() 
    {
        if(this.getPagAtual() == 0)
            this.setPagAtual(0);
        else
            this.pagAtual --;  // Ou usar set é a mesma coisa
    }
    
}
