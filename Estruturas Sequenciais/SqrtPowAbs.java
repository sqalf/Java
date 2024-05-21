package EstruturasSequenciais;

import java.util.Locale;

public class SqrtPowAbs {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double a, b, c;

        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);
        System.out.printf("Raiz de %.2f = %.2f\n", x, a);
        System.out.println("Raiz de " + y + " = " + b);
        System.out.println("Raiz de 25.0 = " + c);
        System.out.println();

        a = Math.pow(x, y);
        b = Math.pow(x, 2);
        c = Math.pow(5, 2);
        System.out.println(x + " elevado a " + y + " = " + a);
        System.out.println(x + " elevado a 2 = " + b);
        System.out.println("5 elevado a 2 = " + c);
        System.out.println();

        a = Math.abs(y);
        b = Math.abs(z);
        System.out.printf("Valor absoluto de %.2f = %.2f\n", y, a);
        System.out.printf("Valor absoluto de %.2f = %.2f", z, b);
    }
}
