package testerestudoswingcomclasseprincipal;

import javax.swing.JOptionPane;

public class TesterEstudoSwingComClassePrincipal 
{

    public static void main(String[] args) 
    {
      String nome;
      float n1, n2, media;
      nome = JOptionPane.showInputDialog("Digite seu Nome: ");
      n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1° Nota: "));
      n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1° Nota: "));
      
      media = (n1 + n2) / 2;
      
      JOptionPane.showMessageDialog(null, "<html>Nome = " + nome + "<hr></hr>"
              + "1° Nota = " + n1 + "<hr></hr>"
              + "2° Nota = " + n2 + "<hr></hr>"
              + "Média = " + media + "</html>");
    }
    
}
