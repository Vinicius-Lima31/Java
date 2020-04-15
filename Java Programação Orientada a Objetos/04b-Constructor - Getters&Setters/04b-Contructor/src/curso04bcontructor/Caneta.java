package curso04bcontructor;

public class Caneta
{
    private boolean tampada;
    private String cor;
    private String modelo;
    private float ponta;
    public Caneta(String m, float p) // Este é o metodo Constructor
    {// Não precisa do VOID
        this.ponta = p;
        this.modelo = m;
        this.tampar();
        this.cor = "Azul";
    }
    public void tampar()
    {
        this.tampada = true;
    }
    public void destampar()
    {
        this.tampada = false;
    }
    public float getPonta()
    {
        return this.ponta;
    }
    public void status()
    {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Ponta: " + this.getPonta() + "\n");
    }
    
}
