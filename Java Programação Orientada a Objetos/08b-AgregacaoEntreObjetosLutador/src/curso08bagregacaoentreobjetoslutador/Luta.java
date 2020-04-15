package curso08bagregacaoentreobjetoslutador;

import java.util.Random;

public class Luta 
{
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    // Métodos
    public void marcarLuta(Lutador l1, Lutador l2)
    {
        if(l1.getCategoria().equals(l2.getCategoria())  // É a mesma coisa que ==
        && l1 != l2)    // Verifica se os lutadores são diferentes
        {
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else
        {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Luta Não Pode Acontecer!");
        }
    }
    public void lutar()
    {
        if(this.aprovado)
        {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            
            switch(vencedor)
            {
                case 0: // Empate
                    System.out.println("\nEmpatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println(this.desafiado.getNome() + " " + this.desafiado.getEmpates());
                    System.out.println(this.desafiante.getNome() + " " + this.desafiante.getEmpates());
                    break;
                case 1: // Desafiado Vence
                    System.out.println("\nVitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("Vitorias " + this.desafiado.getVitorias());

                    break;
                case 2: // Desafiante Vence
                    System.out.println("\nVitoria do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    System.out.println("Vitorias " + this.desafiante.getVitorias());
                    break;
            }
        }
        else
            System.out.println("Luta Não Marcada! ");
    }

    public Lutador getDesafiado() 
    {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) 
    {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() 
    {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) 
    {
        this.desafiante = desafiante;
    }

    public int getRounds()
    {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() 
    {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) 
    {
        this.aprovado = aprovado;
    }
    
    
}
