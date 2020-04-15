package estudoencapsulamento;

public class Porta implements configPorta   // ENCAPSULANDO
{
    private int uso = 0;                // ATRIBUTO
    private boolean aberta;             // ATRIBUTO
    private boolean quebrada;           // ATRIBUTO
    private boolean trancada;           // ATRIBUTO
    private boolean chave;              // ATRIBUTO
    private String pintura;             // ATRIBUTO
    
    public Porta(String cor)          // FUNÇÃO CONSTRUTORA, OS ATRIBUTOS SERÃO DEFINIDAS POR PADRÃO ASSIM!
    {
        this.aberta = false;            // VALOR PADRÃO APÓS SER INSTANCIADA
        this.quebrada = false;          // VALOR PADRÃO APÓS SER INSTANCIADA    
        this.trancada = false;          // VALOR PADRÃO APÓS SER INSTANCIADA
        this.chave = false;             // VALOR PADRÃO APÓS SER INSTANCIADA
        this.setPintura(cor);           // VALOR PADRÃO APÓS SER INSTANCIADA
    }
    
    @Override
    public void abrir()     // MÉTODO PARA ABRIR
    {
       if(this.getUso() >= 10)  // APENAS 10 USOS
            this.setQuebrada(true);
       
       if(this.getQuebrada() == false)  // EU NÃO IREI REALIZAR O MÉTODO CASO A PORTA ESTEJA QUEBRADA! 
       {   
           if(this.getTrancada() == false)   // SÓ VAI ABRIR SE TIVER DESTRANCADA
           {
                if(this.getAberta() == false)    // CASO JA ESTEJA ABERTA, NÃO ABRIRA NOVAMENTE
                {
                     this.setAberta(true);    // PORTA ABERTA
                     System.out.println("Porta Aberta! ");
                }
                else
                    System.out.println("Porta já está Aberta! ");
           }
           else
               System.out.println("Porta está Trancada, Primeiro Destranque para poder Abrir! ");
       }
       else
            System.out.println("Precisa de Conserto! ");    // ELA ESTÁ QUEBRADA E NÃO REALIZOU A OPERAÇÃO
       
       ++uso;       // IRA ACRESCENTAR NÚMEROS DE USO
    }
    
    @Override
    public void fechar()        // MÉTODO PARA FECHAR
    {
        if(this.getUso() >= 10)     // APENAS 10 USOS
            this.setTrancada(true);
        
        if(this.getQuebrada() == false)     // EU NAO IREI REALIZAR O MÉTODO CASO A PORTA ESTEJA QUEBRADA!
        {
            if(this.getAberta() == true)    // SÓ TEM COMO FECHAR SE TIVER ABERTA
            {
                this.setAberta(false);      // PORTA FECHADA
                System.out.println("Porta Fechada! ");
            }
            else
                System.out.println("Porta já está Fechada! ");
        }
        else
            System.out.println("Precisa de Conserto! "); // ELA ESTÁ QUEBRADA E NÃO REALIZOU A OPERAÇÃO
        
        ++uso;      // IRA ACRESCENTAR NÚMEROS DE USO
    }
    
    @Override
    public void trancar()   // MÉTODO PARA TRANCAR
    {
        if(this.getUso() >= 10)     // APENAS 10 USOS
            this.setQuebrada(true);
        
        if(this.getQuebrada() == false) // EU NÃO IREI REALIZAR O MÉTODO CASO A PORTA ESTEJA QUEBRADA 
        {
            if(this.getChave()) // CONFIRO SE EU ESTOU COM A CHAVE PARA PODER TRACAR A PORTA
            {  
                if(this.getAberta() == false)   // SÓ POSSO TRANCAR COM PORTA FECHADA
                {
                    if(this.getTrancada() == false) // VEJO SE JA ESTA TRANCADA
                    {
                        this.setTrancada(true);     // PORTA TRANCADA
                        System.out.println("Porta Trancada! ");
                    }
                    else                            // PORTA JA ESTAVA TRANCADA! 
                        System.out.println("Porta já está Trancada! "); 
                }
                else   
                    System.out.println("Não é possivel Trancar com a Porta Aberta! ");
            }
            else              // NÃO ESTOU COM A CHAVE
                System.out.println("Não estou com a Chave na Mão! ");
        }
        else                    // PORTA QUEBRADA, PRECISA DE CONSERTO! 
            System.out.println("Precisa de Conserto");
        
        ++uso;      // IRA ACRESCENTAR NUMEROS DE USO
    }
    
    @Override
    public void destrancar()        // MÉTODO PARA DESTRANCAR
    {
        if(this.getUso() >= 10)     // APENAS 10 USOS
            this.setQuebrada(true);
        
        if(this.getQuebrada() == false)     // EU NÃO IREI REALIZAR O MÉTODO CASO A PORTA ESTEJA QUEBRADA
        {
            if(this.getChave())     // CONFIRO SE ESTOU COM A CHAVE PARA EU PODER DESTRANCAR A PORTA
            {   
                if(this.getAberta() == false)
                {
                    if(this.getTrancada())      // VEJO SE JA ESTA DESTRANCADA
                    {
                        this.setTrancada(false);    // PORTA DESTRANCADA
                        System.out.println("Porta Destrancada! ");
                    }
                    else                            // PORTA JA ESTAVA DESTRANCADA
                        System.out.println("Porta ja está Destrancada! ");
                }
                else
                    System.out.println("Não é possivel Destrancar com a Porta Aberta! ");
            }
            else                        // NÃO ESTOU COM A CHAVE
                System.out.println("Não estou com a Chave na Mão! ");
        }
        else                    // ESTA QUEBRADA, PRECISA DE CONSERTO
            System.out.println("Precisa de Conserto! ");
        
        ++uso;      // IRA ACRESCENTAR NÚMEROS DE USO
    }
    
    @Override
    public void verQuebrada()   // MÉTODO PARA VER SE ESTA QUEBRADA
    {
        if(this.getQuebrada() == false) // CONFIRO SE REALMENTE ESTÁ 
            System.out.println("Não esta Quebrada! ");
        else        // FAÇO A OPERAÇÃO CASO ESTEJA QUEBRADA
            System.out.println("Está Quebrada! ");
    }
    
    @Override
    public void fazerManutencao()     // MÉTODO PARA CONSERTAR
    {
        if(this.getQuebrada())  // CONFIRO SE REALMENTE ESTÁ QUEBRADA
        {
            System.out.println("Consertando...");   // PORTA CONSERTADA
            this.setQuebrada(false);
            this.setUso(this.getUso() - 7);
        }
        else    // A PORTA NÃO ESTÁ QUEBRADA
            System.out.println("Está Porta está em bom uso, Não necessita de Manutenção! ");
        
    }
    
    @Override
    public void pegarChave()    // MÉTODO PARA PEGAR CHAVE
    {
        if(this.getChave() == false)        // PEGO CHAVE APENAS SE ELA ESTIVER GUARDADA
        {
            System.out.println("Chave na Mão! ");
            this.setChave(true);    // PEGO CHAVE
        }
        else
            System.out.println("Chave ja está na Mão! ");
    }
    
    public void guardarChave()  // MÉTODO PARA GUARDAR CHAVE
    {
        if(this.getChave())     // GUARDO CHAVE APENAS SE ELE ESTIVER COMIGO
        {
            System.out.println("Chave no Bolso! ");
            this.setChave(false);   // GUARDO CHAVE
        }
        else
            System.out.println("Chave já esta Guardada! ");
    }
    
    public boolean getAberta() 
    {
        return aberta;
    }
    
    public void setAberta(boolean aberta) 
    {
        this.aberta = aberta;
    }
  
    public boolean getTrancada() 
    {
        return trancada;
    }
    
    public void setTrancada(boolean trancada) 
    {
        this.trancada = trancada;
    }

    public boolean getChave() 
    {
        return chave;
    }

    public void setChave(boolean chave) 
    {
        this.chave = chave;
    }

    public boolean getQuebrada() 
    {
        return quebrada;
    }

    public void setQuebrada(boolean quebrada) 
    {
        this.quebrada = quebrada;
    }

    private int getUso()        // BOTEI PRIVADO PORQUE É ALGO QUE EU NÃO QUERO QUE SEJA MEXIDO
    {
        return uso;
    }

    private void setUso(int uso) // BOTEI PRIVADO PORQUE É ALGO QUE EU NÃO QUERO QUE SEJA MEXIDO
    {
        this.uso = uso;
    }

    public String getPintura() 
    {
        return pintura;
    }

    public void setPintura(String pintura) 
    {
        this.pintura = pintura;
    }
    
    @Override
    public void sitPorta()      // MÉTODO PARA MOSTRAR SITUAÇÃO DA PORTA
    {
        System.out.println("----------------------------");
        System.out.println("Porta está aberta: " + this.getAberta());
        System.out.println("Porta está Quebrada: " + this.getQuebrada());
        System.out.println("Porta está trancada: " + this.getTrancada());
        System.out.println("Chave está na Mão: " + this.getChave());
        System.out.println("Cor da Porta: " + this.getPintura());
        System.out.println("----------------------------");
    }

    @Override
    public String pintar(String p)  // MÉTODO PARA PINTAR PORTA
    {
        
        if(this.getPintura() != p)  // SE A PORTA PINTADA FOR DIFERENTE DA COR QUE JA ESTAVA PINTADA, ELE IRA PINTAR
        {
            this.setPintura(p);     // PORTA PINTADA
            System.out.println("Porta Pintada!");
        }
        
        else                        // SE A COR FOR IGUAL A COR QUE JA ESTA PINTADA, ELE NAO FARA NADA
            System.out.println("Já está Pintada com essa Cor!");

        return this.getPintura();   // É RETORNADO A COR PINTADA
    }
}
