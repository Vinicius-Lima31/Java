package curso11bherança.parte2;

public class Aluno extends Pessoa
// public final classs Aluno extends Pessoa --> Significa que é a ultima
{// Não podera ter mais filhos
    private int matricula;
    private String curso;
    public void pagarMensalidade()
    {
        System.out.println("Pagando Mensalidade de Aluno" + this.nome); // nome é Protected
    }   // posso usar this.nome pq o atributo nome foi declarado como "protected"

    public int getMatricula() 
    {
        return matricula;
    }
    public void setMatricula(int matricula) 
    {
        this.matricula = matricula;
    }
    public String getCurso() 
    {
        return curso;
    }
    public void setCurso(String curso) 
    {
        this.curso = curso;
    }
    
}
