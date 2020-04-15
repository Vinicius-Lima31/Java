package curso05bexerciciopraticoemjavabanco;

public class contaBanco 
{
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual()
    {
        System.out.println("----------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.printf("Saldo = R$%.2f", this.getSaldo());
        System.out.println("\nStatus: " + this.getStatus());
    }
    
    public void abrirConta(String t)
    {
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC")
            this.setSaldo(50f);
        else if(t == "CP")
            this.setSaldo(150f);
        System.out.println("\nConta Aberta com Sucesso!\n");
    }
    public void fecharConta()
    {
        if(this.getSaldo() > 0)
            System.out.println("Conta Não pode ser Fechada, pois possui dinheiro !");
        else if(this.getSaldo() < 0)
            System.out.println("Não pode ser Fechada, conta esta em Debito!");
        else
        {
            this.setStatus(false);
            System.out.println("Conta Fechada");
        }
    }   
    public void depositar(float v)
    {
        if(this.getStatus())
        {
            this.setSaldo(this.getSaldo() + v );
            System.out.println("Deposito Realizado na Conta: " + this.getDono());
        }
        else
            System.out.println("Conta Fechada");
    }
    public void sacar(float v)
    {
        if(this.getStatus())
        {
            if(this.getSaldo() >= v)
            {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque Realizado na Conta: " + this.getDono());
            }
            else
                System.out.println("Saldo Insuficiente!");
        }
        else
            System.out.println("Impossivel Sacar! Conta Fechada");
    }
    public void pagarMensal()
    {
        float n = 0;
        if(this.getTipo() == "CC")
            n = 12;
        else if(this.getTipo() == "CP")
            n = 20;
        if(this.getStatus())
        {
            this.setSaldo(this.getSaldo() - n);
            System.out.println("Mensalidade Paga com sucesso por " + this.getDono());
        }
        else
            System.out.println("Impossivel pagar uma conta Fechada! ");
    }
    
    public contaBanco() // Metodo Constructor
    {
        this.saldo = 0;
        this.status = false;
    }
    public int getNumConta() 
    {
        return numConta;
    }
    public void setNumConta(int numConta) 
    {
        this.numConta = numConta;
    }
    public String getTipo() 
    {
        return tipo;
    }
    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }
    public String getDono() 
    {
        return dono;
    }
    public void setDono(String dono) 
    {
        this.dono = dono;
    }
    public float getSaldo() 
    {
        return saldo;
    }
    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }
    public boolean getStatus() 
    {
        return status;
    }
    public void setStatus(boolean status) 
    {
        this.status = status;
    }
    
}