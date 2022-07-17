// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.*;
public class DIO
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int desconto;
        int precoAntigo;

       // System.out.println("Digite o desconto: ");
        desconto = input.nextInt();
       // System.out.println("Digite o valor atual: ");
        precoAntigo = input.nextInt();
        int precoNovo = precoAntigo - (precoAntigo * desconto /100);
        System.out.println(precoNovo);
    }
}