package curso13bpolimorfismoparte2;

public class Lobo extends Mamifero
{
   /* @Override
    public void emitirSom(int i)
    {
        Não funciona porque não possuem mesmas assinaturas
        A assinatura não passa parametros, e eu passei nessa aqui
        portanto não funciona
    }
        */
    @Override
    public void emitirSom()
    {
        System.out.println("Auuuuuuuu! Auuuuuuu!");
    }
    
}
