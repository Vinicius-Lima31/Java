package curso15testefuncao01;

public class Curso15TesteFuncao01 
{
    //void soma (int a, int b) --> Não vai funcionar... MINUTO 9:00
    static void soma (int a, int b)
    {
        int s = a + b;
        System.out.println("A Soma é: " + s);
    }
    
    static int soma1 (int a, int b)
    {
        int s = a + b;
        return s;
    }

    public static void main(String[] args) 
    {
        System.out.println("Começou o Programa");
        soma(6, 4);
        
        System.out.println("\nComeçou o Programa");
        int sm2 = soma1(5, 2);
        System.out.println("A soma é: " + sm2);
        
    }
    
}
