package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Taxa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("digite o valor do produto: ");
        double produto = read.nextDouble();
        double frete = produto * 0.08;
        double taxa = produto * 0.92;
        double total = (produto >= 100) ? produto + taxa : produto + frete + taxa;
        System.out.println("total: " + total);

    }
}
