package canetaencapsulamento;

import javax.swing.JOptionPane;

public class Caneta implements Canet
{
    private int rec;
    private boolean tampada;
    
    public Caneta()
    {
        this.tampada = false;
        this.rec = 100;
    }
    public int getRec() 
    {
        return rec;
    }
    public void setRec(int rec)
    {
        this.rec = rec;
    }
    public boolean getTampada()
    {
        return tampada;
    }
    public void setTampada(boolean tampada) 
    {
        this.tampada = tampada;
    }

    @Override
    public void tampar() 
    {
        if(this.getTampada() == false)
            this.setTampada(true);
        else
            JOptionPane.showMessageDialog(null, "Já está Tampada!", "Tampada", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void destampar() 
    {
        if(this.getTampada())
            this.setTampada(false);
        else
            JOptionPane.showMessageDialog(null, "Ja está Destampada!", "Destampada", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void recarregar() 
    {
       if(this.getRec() <= 20)
           this.setRec(100);
       else
           JOptionPane.showMessageDialog(null, "Não precisa de Recarregamento", "Recarregar", JOptionPane.CLOSED_OPTION);
    }

    @Override
    public void situacao() 
    {
        JOptionPane.showMessageDialog(null, "Tampada" + this.getTampada(), "Tampa", JOptionPane.ALLBITS);
        JOptionPane.showMessageDialog(null, "Carga" + this.getRec(), "Carga", JOptionPane.ALLBITS);
    }
    
}
