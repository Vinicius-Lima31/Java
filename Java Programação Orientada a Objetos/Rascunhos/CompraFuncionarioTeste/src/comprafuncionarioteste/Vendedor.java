package comprafuncionarioteste;

import java.util.Random;
import java.util.Scanner;

public final class Vendedor extends Pessoa
{
    private float dinheiroRecebido;
    private float preço = 0;
    private int desconto;
    private boolean pagamento = false;
    
    public void pagFuncionario()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja Pagar Funcionario?");
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
    
    public void cobrança(float p)
    {
        
        if(pagamento)
        {
            Random a1 = new Random();
            int r1 = a1.nextInt(5); // 0 1 2 3 4
            if(r1 == 3) // Desconto sera Aplicado se o Número aleatorio for 3
            {
                System.out.println("\nDesconto Aplicado");
                System.out.printf("Desconto de 15Porcento no valor R$%.2f \n", p);
                double desc = p * 0.15;
                this.setPreço(p - (float) desc);
            }
            else
            {
                System.out.println("\nDesconto não Disponivel");
                this.setPreço(p);
            }
        }
        else
            System.out.println("Pagamento Não Autorizado Pelo Funcionario");
    }

    public Vendedor(String n, int id, String s)
    {
        super(n, id, s);
    }

    public float getDinheiroRecebido() 
    {
        return dinheiroRecebido;
    }

    public void setDinheiroRecebido(float dinheiroRecebido) 
    {
        this.dinheiroRecebido = dinheiroRecebido;
    }

    public float getPreço() 
    {
        return preço;
    }

    public void setPreço(float preço) 
    {
        this.preço = preço;
    }

    public int getDesconto() 
    {
        return desconto;
    }

    public void setDesconto(int desconto) 
    {
        this.desconto = desconto;
    }

    public boolean getPagamento() 
    {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) 
    {
        this.pagamento = pagamento;
    }
    
    
    
}
