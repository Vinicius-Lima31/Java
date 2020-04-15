package estudoencapsulamento;

public interface configPorta 
{
    public abstract void abrir();
    public abstract void fechar();
    public abstract void trancar();
    public abstract void destrancar();
    public abstract void verQuebrada();
    public abstract void fazerManutencao();
    public abstract void pegarChave();
    public abstract void sitPorta();
    public abstract String pintar(String p);
}
