package curso15bprojetofinalparte2;
// Classe de Agregação das classes "Video"" e "Gafanhoto"
public class Vizualicao 
{
    private Gafanhoto espectador;
    private Video filme;

    public Vizualicao(Gafanhoto espectador, Video filme) // passando a classe Gafanhoto e Filme por parametros
    {
        this.espectador = espectador;
        this.filme = filme;
        // Tou entrando em Gafanhoto e alterandoo a quantidade de espectador
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    // Teremos uma "SOBRECARGA" aqui!
    public void avaliar()
    {// se eu nao dar nota ele recebe 5
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota)
    {// eu dou a nota
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc)
    {// porcentagem do video
        int tot = 0;
        if(porc <= 20)
            tot = 3;
        else
            if(porc <= 50)
                tot = 5;
            else
                if(porc <= 90)
                    tot = 8;
                else 
                    tot = 10;
        this.filme.setAvaliacao(tot);
    }
    
    //public void avaliar(int n)
    //{...} Não funciona porque tem Assinaturas iguais e nao pode.
        
    public Gafanhoto getEspectador() 
    {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) 
    {
        this.espectador = espectador;
    }
    public Video getFilme() 
    {
        return filme;
    }
    public void setFilme(Video filme)
    {
        this.filme = filme;
    }

    @Override
    public String toString() 
    {
        return "Vizualicao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
