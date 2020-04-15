package curso11bherança.parte2;

public final class Bolsista extends Aluno // Significa que é a ultima classe
{   // "FINAL" não pode mais ter sub-Class, não pode mais ter filhos
    private float bolsa;
    
    public void renovarBolsa()
    {
        System.out.println("Renovando Bolsa de " + this.nome);
    }
    @Override  // Override significa "SOBREPOR" Estou sobrepondo
    public final void pagarMensalidade()  // esse "final" significa que nao pode
    {// ser sobreposto, se eu criar uma sub-classe de Bolsista, eu não posso sobrepor esse metodo
        System.out.println(this.nome + " é bolsista! Pagamento facilitado");
    }
    public float getBolsa() 
    {
        return bolsa;
    }
    public void setBolsa(float bolsa) 
    {
        this.bolsa = bolsa;
    } 
}
