package contructor;

import javax.swing.JOptionPane;

public class NewClass 
{
    public static void main(String[] args) 
    {
        caderno c1 = new caderno("Happy", "Mar", 96, 1);
        String p;
        p = JOptionPane.showInputDialog(null, "Deseja mostrar o Objeto ?", "Mostrar Objeto", JOptionPane.HEIGHT);
        if(p == "SIM" || p == "sim" || p == "s" || p == "S")
            System.out.println("ola");
    }
}
