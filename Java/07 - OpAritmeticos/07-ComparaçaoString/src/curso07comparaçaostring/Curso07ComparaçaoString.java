package curso07comparaçaostring;


public class Curso07ComparaçaoString {

   
    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1 == nome2) ? "Iguais" : "Diferentes";
        System.out.println(res);
    }
    
}
