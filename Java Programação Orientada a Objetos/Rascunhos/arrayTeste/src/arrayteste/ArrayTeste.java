package arrayteste;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArrayTeste 
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Começo o Ploglama! ");
        System.out.print("Vetor de Quantas Posições?");
        int q = ler.nextInt();
        int n[] = new int[q];
        for(int c = 0; c < n.length; c++)
        {
            System.out.print("Digite Valor de n[" + c + "] = ");
            n[c] = ler.nextInt();
        }
        
        System.out.println("Quer Ordenar o Vetor ? (Sim) / (Não)");
        String r = ler.next();
        if(r.equals("SIM") || r.equals("Sim") || r.equals("S") || r.equals("s") || r.equals("sim"))
        {
             Arrays.sort(n);
             System.out.println();
        }
        System.out.println("Mostrar o Vetor! ");
        for(int v: n)
            System.out.println(v);
    }
    
}
