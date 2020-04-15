package curso13bpolimorfismoparte2;

public class Curso13bPolimorfismoparte2 
{
    public static void main(String[] args) 
    {
       // Animal n = new Animal(); Não funciona, pois é abstrata
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        l.emitirSom();
        c.emitirSom();
        c.reagir("Ola");
        c.reagir(true);
        c.reagir(false);
        c.reagir(18, 20);
    }
}
