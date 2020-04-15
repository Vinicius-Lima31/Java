package curso02bcriandoobjetoclasse;

public class Curso02bCriandoObjetoClasse 
{
    public static void main(String[] args) 
    {
        Caneta c1 = new Caneta();
        c1.modelo = "BIG";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        
        c1.tampar();
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        System.out.println("");
        
        Caneta c2 = new Caneta();
        c2.modelo = "Compactor";
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.carga = 100;
        c2.tampar();
        
        c2.rabiscar();
    }
    
}
