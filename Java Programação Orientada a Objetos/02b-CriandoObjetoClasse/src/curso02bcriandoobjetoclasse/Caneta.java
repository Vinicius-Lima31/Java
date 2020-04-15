package curso02bcriandoobjetoclasse;

public class Caneta 
{
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status()
    {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("A Caneta é " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada: " + this.tampada);
    }
    
    void rabiscar()
    {
        if(this.tampada == true)
            System.out.println("ERRO! Não posso Rabiscar");
        else
            System.out.println("Estou Rabiscando! ");
    }
    
    void tampar()
    {
        this.tampada = true;
    }
    
    void destampar()
    {
        this.tampada = false;
    }
}
