package curso11bherança.parte2;

public class Curso11bHerançaParte2 
{
    public static void main(String[] args) 
    {
       //Pessoa p1 = new Pessoa(); Não vai funcionar porque é abstrata
       // public abstract class Pessoa, não pode ser instanciada
        Visitante v1 = new Visitante(); // Instanciei Visitante
        System.out.println(v1.toString());  // Imprimi objeto V1 instanciado de Visitante
        Aluno a1 = new Aluno(); // Instanciando classe Aluno
        a1.setNome("Claudio");  // atribuindo valor nos atributos de aluno
        System.out.println(a1.toString());  // Imprimindo objeto a1 instanciado de Aluno
        Bolsista b1 = new Bolsista();
        b1.setMatricula(157);   // Herdado de Aluno
        b1.nome = "Jubileu";
        b1.pagarMensalidade();  // Método Sopreposto(Override)
        b1.renovarBolsa();
        
        Tecnico t1 = new Tecnico();
        t1.nome = "Otavio";
        t1.praticar();
    }
}
