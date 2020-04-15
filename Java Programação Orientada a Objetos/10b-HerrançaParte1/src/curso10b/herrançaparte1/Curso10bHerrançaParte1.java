package curso10b.herrançaparte1;

public class Curso10bHerrançaParte1 
{
    public static void main(String[] args) 
    {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Zelador p5 = new Zelador();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        p5.setNome("Robson");
        p1.setSexo("M");
        
        // p1.receberAumentto(500); Não funciona, porque esse método é de Professor  
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
