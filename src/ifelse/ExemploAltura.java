package ifelse;

import java.util.Scanner;
public class Exemplo4 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua nome:   ");

        String nome = s.nextLine();
        System.out.println("\nDigite sua altura:  ");
        Double altura = s.nextDouble();
        System.out.println(nome  +  "  tem  "  + altura  +  "  de altura.  ");
    }
}
