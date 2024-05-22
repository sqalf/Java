package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Descont {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner read = new Scanner(System.in);

        System.out.println("digite o valor da compra: ");
        double compra = read.nextDouble();
        double frete = 50;

        double desconto = (compra > 100) ? desconto = compra * 0.9: compra + frete;

        System.out.printf("R$ %.2f\n", desconto);
    }
}
