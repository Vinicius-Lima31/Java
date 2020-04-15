package testeobjeto;

public class TesteObjeto 
{
    public static void main(String[] args) 
    {
        Toalha t1 = new Toalha();
        Mochila m1 = new Mochila();
        
        t1.tecido = "Pano";
        t1.cor = "Azul Forte";
        t1.limpa();
        t1.molhada();
        t1.seca();
        
        t1.status();
        t1.uso();
        
        System.out.println("");
        
        m1.marca = "Fila";
        m1.cor = "Verde e Preto";
        m1.sexo = 'M';
        
        m1.bolsos(5);
        m1.stauts();
        m1.rasgada(false);
        m1.usavel();
    }
}
