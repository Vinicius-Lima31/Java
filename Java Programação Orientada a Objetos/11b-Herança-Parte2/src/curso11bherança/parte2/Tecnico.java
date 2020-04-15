package curso11bherança.parte2;

public final class Tecnico extends Aluno // Não pode ter filhos
{
    private String registroProfissional;
    public final void praticar()  // Não pode ser sobreposto
    {
        System.out.println("Praticando!");
    }
}
