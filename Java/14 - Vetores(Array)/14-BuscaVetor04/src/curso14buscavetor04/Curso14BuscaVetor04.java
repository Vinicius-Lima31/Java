package curso14buscavetor04;

import java.util.Arrays;

public class Curso14BuscaVetor04 
{

    public static void main(String[] args) 
    {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        Arrays.sort(vet);
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("Encontrei o valor 1 na Posição = " + p);
    }
    
}
