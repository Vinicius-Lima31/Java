package curso14bprojetofinalemjavaparte1;

public class Curso14bProjetoFinalEmJavaParte1 
{
    public static void main(String[] args) 
    {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01");
        v[1] = new Video("Aula 02");
        v[2] = new Video("Aula 03");
        
        System.out.println(v[0].toString());
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
        
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
    }
}
