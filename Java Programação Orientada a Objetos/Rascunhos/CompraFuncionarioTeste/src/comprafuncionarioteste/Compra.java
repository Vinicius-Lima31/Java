package comprafuncionarioteste;

import java.util.Scanner;

public final class Compra implements InterfaceCompra
{
    private Comprador c;
    private Vendedor v;
    public boolean cp = false;
    float d = 0;
    Scanner input = new Scanner(System.in);
    
    
    @Override
    public void autorizarCompra(Comprador c1, Vendedor v1)
    {
        c = c1;
        v = v1;
        
        if(c.gettPagamento() == true && v.getPagamento() == true)
        {
            System.out.println("Compra Autorizada! ");
            cp = true;
        }
        else
        {
            System.out.println("Compra não Autorizada! ");
            cp = false;
        }
    }

    @Override
    public void comprar()
    {
        if(cp)
        {
            System.out.printf("\nPreço a se pagar R$%.2f \n", v.getPreço());
            System.out.println("\nValor a Pagar ");
            System.out.print("R$");
            d = input.nextFloat();
            if(d <= c.getDinheiro() && d == v.getPreço())
            {
                c.setDinheiro(c.getDinheiro() - d);
                v.setDinheiroRecebido(v.getDinheiroRecebido() + d);
                System.out.println("\nCompra feita");
                System.out.println("Pagamento Realizado\n");
            }
            else
            {
                System.out.println("\nSaldo Insuficiente ou Valor Invalido! ");
                System.out.printf("Seu Saldo R$%.2f \n", c.getDinheiro());
                System.out.printf("Preço do Produto R$%.2f \n", v.getPreço());
            }
        }
        else
            System.out.println("\nPagamento Não Autorizado! ");
    }
    
    public Comprador getC() 
    {
        return c;
    }

    public void setC(Comprador c) 
    {
        this.c = c;
    }

    public Vendedor getV() 
    {
        return v;
    }

    public void setV(Vendedor v) 
    {
        this.v = v;
    }

    public boolean getCp() 
    {
        return cp;
    }

    public void setCp(boolean cp) 
    {
        this.cp = cp;
    }
    
    
}
