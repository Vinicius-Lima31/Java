package curso10b.herrançaparte1;

public class Funcionario extends Pessoa
{   // Funcionario herda atributos e métodos de Pessoa
    private String setor;
    private boolean trabalhando;
    
    public void mudaTrabalho()
    {
        this.trabalhando = ! this.trabalhando;  // Inverti, usei o not
    }

    public String getSetor() 
    {
        return setor;
    }
    public void setSetor(String setor) 
    {
        this.setor = setor;
    }
    public boolean getTrabalhando() 
    {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) 
    {
        this.trabalhando = trabalhando;
    }
    
    
}
