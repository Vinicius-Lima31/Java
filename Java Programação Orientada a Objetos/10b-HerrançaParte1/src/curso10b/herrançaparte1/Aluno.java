package curso10b.herrançaparte1;

public class Aluno extends Pessoa   // Aluno extende de Pessoa, Herança 
{   // Herdando atributos e metodos de Pessoa
    private int mat;
    private String curso;
    
    public void cancelarMat()
    {
        System.out.println("Matricula será Cancelada!");
    }
    
    public int getMat() 
    {
        return mat;
    }
    public void setMat(int mat) 
    {
        this.mat = mat;
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