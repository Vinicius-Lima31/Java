
package curso06conflitointstring;


public class Curso06ConflitoIntString {

    public static void main(String[] args) {
        int n = 30;
        String valor1 = Integer.toString(n);
        System.out.println(valor1);
        
        String valor2 = "30";
        int idade1 = Integer.parseInt(valor2);
        System.out.println(valor2);
        
        String valor3 = "30";
        float idade2 = Float.parseFloat(valor3);
        System.out.println(valor3);
    }
    
}
