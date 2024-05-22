package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class OpComulativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner read = new Scanner(System.in);
        double minutos = read.nextDouble();
        double conta = 50;

        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }
        System.out.printf("Conta: %.2f\n", conta);
    }
}
