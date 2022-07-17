// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.*;
public class DIO
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // System.out.println("Digite o total de eleitores: ");
        int habitantes = input.nextInt();
       // System.out.println("Digite o total de votos brancos: ");
        int brancos = input.nextInt();
       // System.out.println("Digite o total de votos nulos: ");
        int nulos = input.nextInt();
       // System.out.println("Digite o total de votos válidos: ");
        int validos = input.nextInt();


        int pBrancos = (brancos * 100) / habitantes;
        int pNulos = (nulos * 100) / habitantes;
        int pValidos = (validos * 100) / habitantes;


        System.out.println("Brancos: " + pBrancos + "%");

        System.out.println("Nulos: " + pNulos + "%");

        System.out.println("Validos: " + pValidos + "%");
    }
}