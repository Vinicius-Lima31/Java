package javaapplication71;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaApplication71 {

    public static void main(String[] args) 
    {
        
        JOptionPane.showMessageDialog(null, "Aperte Ok Para Iniciar", "Inicio", JOptionPane.YES_OPTION);
        String nome = JOptionPane.showInputDialog(null, "Digite seu Nome", "Nome", JOptionPane.FRAMEBITS);
        JOptionPane.showMessageDialog(null, "Nome: " + nome, "Nome", JOptionPane.CLOSED_OPTION);
    }
    
}
