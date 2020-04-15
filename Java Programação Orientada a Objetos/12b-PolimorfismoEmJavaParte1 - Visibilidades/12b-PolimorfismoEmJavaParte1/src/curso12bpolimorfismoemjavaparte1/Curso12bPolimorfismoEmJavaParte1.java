package curso12bpolimorfismoemjavaparte1;

public class Curso12bPolimorfismoEmJavaParte1 
{

    public static void main(String[] args) 
    {
       Mamifero m = new Mamifero();
       Repitil r = new Repitil();
       Peixe p = new Peixe();
       Ave a = new Ave();
       Canguru c = new Canguru();
       Cobra j = new Cobra();
       Arara e = new Arara();
       
       c.locomover();
       j.alimentar();
       j.emitirSom();
    }
    
}
