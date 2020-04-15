package curso02bcriandoobjetoclasse;

public class Curso02bCriandoObjetoClasse 
{
    public static void main(String[] args) 
    {
        Caneta c1 = new Caneta();
        c1.modelo = "Big Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; Não funcionou, porque é privada para classe CANETA
        c1.carga = 80;
        c1.destampar();
        c1.status();
        
    }
    
}
