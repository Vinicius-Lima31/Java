package estudometodos;

import javax.swing.JOptionPane;

public class EstudoMetodos 
{

    public static void main(String[] args) 
    {
        Experimento e = new Experimento();
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um Numero: ", "Quadrado", JOptionPane.YES_OPTION));
        e.setQuad(n);
        JOptionPane.showMessageDialog(null, "Quadrado de " + n + " = " + e.getQuad());
    }
    
}
