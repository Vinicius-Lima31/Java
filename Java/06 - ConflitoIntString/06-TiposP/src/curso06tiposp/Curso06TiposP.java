
package curso06tiposp;

import java.util.Scanner;


public class Curso06TiposP {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu Nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Digite Sua Nota: ");
        float nota = teclado.nextFloat();
        
        System.out.format("\nSeu nome: %s \nSua Nota: %.2f\n", nome, nota);
        
    }
    
}
