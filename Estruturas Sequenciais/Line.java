package EstruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Line {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String l1, l2, l3;
        System.out.println("digite a linha 1: ");
        l1 = sc.nextLine();
        System.out.println("digite a linha 2: ");
        l2 = sc.nextLine();
        System.out.println("digite a linha 3: ");
        l3 = sc.nextLine();
        sc.close();

        System.out.println("digitado: ");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

    }
}
