package curso15bprojetofinalparte2;

public class Curso15bProjetoFinalParte2 
{
    public static void main(String[] args) 
    {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01");
        v[1] = new Video("Aula 02");
        v[2] = new Video("Aula 03");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
        
        Vizualicao vis[] = new Vizualicao[5];
        vis[0] = new Vizualicao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Vizualicao(g[0], v[1]);
        vis[1].avaliar(70f);
        System.out.println(vis[1].toString());  // Existe uma funnção na Classe "Video" chamada Objeto
        
    }
}
