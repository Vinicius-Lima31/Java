package curso05bexerciciopraticoemjavabanco;

public class Curso05bExercicioPraticoEmJavaBanco 
{
    public static void main(String[] args) 
    {
        //Jubileu
        contaBanco p1 = new contaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.estadoAtual();
        
        //Creuza
        contaBanco p2 = new contaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        
        p1.depositar(100f);
        p2.depositar(500f);
        p1.fecharConta();
        p2.sacar(100);
        p2.sacar(1000);
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        contaBanco p3 = new contaBanco();
        p3.setDono("Robson");
        p3.setNumConta(3333);
        p3.abrirConta("CP");
        p3.sacar(150);
        p3.fecharConta();
        p3.estadoAtual();
        
    }
    
}
