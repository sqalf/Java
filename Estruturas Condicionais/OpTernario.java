package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class OpTernario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valor = read.nextDouble();
        double desconto = (valor < 100) ? valor : valor * 0.8;

        System.out.printf("R$ %.2f\n", desconto);
    }
}
