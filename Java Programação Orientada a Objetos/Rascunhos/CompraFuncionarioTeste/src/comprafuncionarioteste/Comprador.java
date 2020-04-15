package comprafuncionarioteste;

import java.util.Scanner;

public final class Comprador extends Pessoa
{
    private float dinheiro = 0;
    private float dinheiroCompra;
    private boolean pagamento = false;

    public Comprador(String n, int id, String s) 
    {
        super(n, id, s);
    }
    
    public void pagCliente()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja Pagar Cliente?");
        System.out.println("1 (Sim) / 0 (Não)");
        int p = input.nextInt();
        if(p == 1)
        {
            System.out.println("\nAutorizado");
            this.setPagamento(true);
        }
        else
        {
            System.out.println("\nNão Autorizado");
            this.setPagamento(false);
        }
    }
    
    public void depositar(float d)
    {
        this.setDinheiro(d);
    }

    public float getDinheiro() 
    {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) 
    {
        this.dinheiro = dinheiro;
    }

    public float getDinheiroCompra() 
    {
        return dinheiroCompra;
    }

    public void setDinheiroCompra(float dinheiroCompra) 
    {
        this.dinheiroCompra = dinheiroCompra;
    }

    public boolean gettPagamento() 
    {
        return pagamento;
    }

    public void setPagamento(boolean pagamento)
    {
        this.pagamento = pagamento;
    }
    
    
}
