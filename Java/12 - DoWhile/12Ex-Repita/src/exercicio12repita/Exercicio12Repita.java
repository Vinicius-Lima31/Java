package exercicio12repita;

import javax.swing.JOptionPane;

public class Exercicio12Repita 
{

    public static void main(String[] args) 
    {
       /* 
        * JOptionPane.showMessageDialog(null, "Ola Mundo! ", "Boas Vindas", JOptionPane.ERROR_MESSAGE);
                                            // MSG          //nome              // Icone                            
    
        * int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um Número: ", "Boas Vindas", JOptionPane.ERROR_MESSAGE));
        * JOptionPane.showMessageDialog(null, "Voce Digitou = " + n);*/
        
        int n;
        int s = 0;
        int quant = 0;
        int totalPar = 0;
        int totalImpar = 0;
        int acimacem = 0;
        do
        {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um Numero: <br><em>(Valor 0 Interrompe) </em> </br> </html>"));
            quant++;
            
            if(n % 2 == 0)
                totalPar++;
            else 
                totalImpar++;
            
            if(n > 100)
                acimacem++;
                
            s += n;
        }while(n != 0);
        
        JOptionPane.showMessageDialog(null, "<html>Resultado Final<hr></hr>"
                + "<br>Total de Valores: " + (--quant) + "</br>"
                + "<br>Total de Pares: " + (totalPar -1) + "</br>"
                + "<br>Total de Impares: " + totalImpar + "</br>"
                + "<br>Acima de 100: " + acimacem + "</br>"
                + "<br>Média dos Valores: " + (s/quant) +"</br>");
        
        
    }
    
}
