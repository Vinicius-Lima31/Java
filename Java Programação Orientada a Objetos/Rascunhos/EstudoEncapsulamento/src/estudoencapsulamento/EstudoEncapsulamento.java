package estudoencapsulamento;

public class EstudoEncapsulamento 
{
    public static void main(String[] args) 
    {
        Porta p[] = new Porta[3];
        p[0] = new Porta("Branco");
        p[1] = new Porta("Marron");
        p[2] = new Porta("Amarelo");
        p[0].sitPorta();
        p[2].pintar("Azul");
        p[2].sitPorta();
        
       
    }
}
