package testeobjeto;

import javax.swing.JOptionPane;

public class Toalha 
{
    String tecido;
    String cor;
    boolean limpa;
    boolean seca;
    
    void status()
    {
        System.out.println("Tecido = " + this.tecido);
        System.out.println("Cor = " + this.cor);
        System.out.println("Limpa = " + this.limpa);
        System.out.println("Seca = " + this.seca);
    }
            
    void limpa()
    {
        this.limpa = true;
    }
    void suja()
    {
        this.limpa = false;
    }
    void molhada()
    {
        this.seca = false;
    }
    void seca()
    {
        this.seca = true;
    }
    void uso()
    {
        if(this.seca == true && this.limpa == true)
            JOptionPane.showMessageDialog(null, "<html><b>A Toalha é Usavel!</b></html>");
        else
            JOptionPane.showMessageDialog(null, "<html><b>Tolha não é Usavel! </b></html>");
    }
}
