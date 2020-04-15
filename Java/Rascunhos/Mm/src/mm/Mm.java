package mm;

import javax.swing.JOptionPane;


public class Mm 
{
    public static void main(String[] args) 
    {
        String nome = JOptionPane.showInputDialog(null,"Digite seu Nome");
        if(nome != "marcella")
            JOptionPane.showMessageDialog(null, "<html> <b>Fuma Cigarro Pra caralho</b></html>");
    }
    
}
