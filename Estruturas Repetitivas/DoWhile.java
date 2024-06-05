package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        char r;

        do {
            System.out.println("Digite a temperatura em Graus ºC: ");
            double c = read.nextDouble();
            double f = 9 * c / 5 + 32;
            System.out.printf("%.1f Graus ºC equivalem a %.1f Graus ºF\n", c, f);
            System.out.println("Deseja repetir? (s/n)");
            r = read.next().charAt(0);
        } while (r != 'n');

        read.close();
    }
}
