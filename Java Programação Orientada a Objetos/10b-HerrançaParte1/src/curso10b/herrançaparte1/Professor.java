package curso10b.herrançaparte1;

public class Professor extends Pessoa
{   ///Professor herda de Pessoa
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aum)
    {
        this.setSalario(this.getSalario() + aum);
    }

    public String getEspecialidade() 
    {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) 
    {
        this.especialidade = especialidade;
    }
    public float getSalario() 
    {
        return salario;
    }
    public void setSalario(float salario) 
    {
        this.salario = salario;
    }
    
    
}
