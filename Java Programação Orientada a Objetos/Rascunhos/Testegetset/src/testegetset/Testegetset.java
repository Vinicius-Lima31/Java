package testegetset;

import javax.swing.JOptionPane;

public class Testegetset 
{

    public static void main(String[] args) 
    {
        Monitor m1 = new Monitor();
        m1.setMarca("Samsung");
        m1.setCor("Preta");
        m1.setLigada(true);
        m1.setInternet(false);
        m1.setPolegadas(32.1f);
        m1.status();
        JOptionPane.showMessageDialog(null, m1.getMarca() + "\n" + m1.getCor());
    }
    
}
