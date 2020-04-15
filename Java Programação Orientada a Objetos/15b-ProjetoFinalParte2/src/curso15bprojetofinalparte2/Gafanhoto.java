package curso15bprojetofinalparte2;

public class Gafanhoto extends Pessoa
{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) // botei login aqui só praa eu botar
    {      //                                                               Quando for instanciar 
        super(nome, idade, sexo);   // Chama de Pessoa, super classe
        this.login = login;
        this.totAssistido = 0;
    }
    
    @Override
    public String toString() 
    {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }   //  super acessando metodo do PAI, botei metodo toString em Pessoa
    
    public String getLogin() 
    {
        return login;
    }

    public void setLogin(String loginn) 
    {
        this.login = loginn;
    }

    public int getTotAssistido() 
    {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido)
    {
        this.totAssistido = totAssistido;
    }

}
