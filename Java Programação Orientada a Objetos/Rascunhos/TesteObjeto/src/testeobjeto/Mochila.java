package testeobjeto;

import javax.swing.JOptionPane;

public class Mochila 
{
    String marca;
    String cor;
    char sexo;
    int bolsos;
    boolean rasgada;
    
    void stauts()
    {
        System.out.println("Marca = " + this.marca);
        System.out.println("Cor = " + this.cor);
        System.out.println("Genero = " + this.sexo);
        System.out.println("Quantidade de Bolsos = " + this.bolsos);
    }
    
    int bolsos(int n)
    {
        return this.bolsos = n;
    }
    boolean rasgada(boolean n)
    {
        return this.rasgada = n;
    }
    void usavel()
    {
        if(this.rasgada = false)
            JOptionPane.showMessageDialog(null, "<html><b>Mochila Não é Usavel !</b></html>");
        else
            JOptionPane.showMessageDialog(null, "<html><b>Mochila é Usavel!</br></html>");
    }
}
