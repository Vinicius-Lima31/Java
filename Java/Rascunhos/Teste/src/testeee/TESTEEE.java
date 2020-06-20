package testeee;

import javax.swing.JOptionPane;

public class TESTEEE 
{
    public static void main(String[] args) 
    {
        String nome;
        int mat;
        float n1, n2, n3, media = 0;
        
        nome = JOptionPane.showInputDialog(null, "Informe seu Nome ", "Nome do Usuario", JOptionPane.CANCEL_OPTION);
        mat = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua Matricula "));
        n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "1° Nota "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "2° Nota "));
        n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "3° Nota "));
        
        media = (n1 + n2 + n3) / 3;
        
        JOptionPane.showMessageDialog(null, "<html> Nome: " + nome + "<hr></hr>"
                + "Matricula: " + mat + "<hr></hr>"
                + "Primeira Nota: " + n1 + "<hr></hr>"
                + "Segunda Nota: " + n2 + "<hr></hr>"
                + "Terceira Nota: " + n3 + "<hr></hr>"
                + "Média: " + String.format("%.2f", media) + "</html>");
       
        
    }
    
}
