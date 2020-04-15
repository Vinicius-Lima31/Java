package objetocaderno;

import javax.swing.JOptionPane;

public class Objetocaderno 
{
    public static void main(String[] args) 
    {
        caderno c1 = new caderno("Happy", "Mar", 96, 1);
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Deseja mostrar o Objeto ? <br>(1)Sim (0) Não</br></html>", "Mostrar Objeto", JOptionPane.HEIGHT));
        
        if(n == 1)
        {
            JOptionPane.showMessageDialog(null, "<html>Caderno" + "<br></br>"
                    + "Marca: " + c1.getMarca() + "<br></br>"
                    + "Tema: " + c1.getTema() + "<br></br>"
                    + "Quantidade de Folhas: " + c1.getFolhas() + "<br></br>"
                    + "Quantidade de Materias: " + c1.getMaterias() + "</html>" , "Objeto", JOptionPane.YES_OPTION);
        }
        else
            JOptionPane.showMessageDialog(null, "Deixa pra Proxima! ");
    }
}
