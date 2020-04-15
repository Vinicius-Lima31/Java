package comprafuncionarioteste;

public class CompraFuncionarioTeste
{
    public static void main(String[] args) 
    {
        Comprador c1 = new Comprador("João", 28, "M");
        Vendedor v1 = new Vendedor("Pedro", 24, "M");
        Compra cp = new Compra();
        
        c1.depositar(500f);
        
        System.out.println(c1.toString());
        System.out.println(v1.toString());
        
        //Pessoa p1 = new Pessoa();  Não é possivel em instanciar Pessoa, porque eu botei como Abstract
        
        c1.pagCliente();        // Autorizar Pagamento por parte do Cliente
        v1.pagFuncionario();    // Autorizar Pagamento por parte do Funcionario
        v1.cobrança(230f);
        cp.autorizarCompra(c1, v1);
        cp.comprar();
        
        System.out.println();
        System.out.printf("Vendedor = R$%.2f", v1.getDinheiroRecebido());
        System.out.printf("\nComprador = R$%.2f \n", c1.getDinheiro());
    }
}
