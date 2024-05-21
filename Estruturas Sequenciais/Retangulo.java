package EstruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("digite o valor da base do retangulo: ");
        double base = read.nextDouble();
        System.out.println("digite o valor da altura do retangulo: ");
        double altura = read.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt(base * base + altura * altura);

        System.out.printf("Base: %.1f\n", base);
        System.out.printf("Altura: %.1f\n", altura);
        System.out.printf("Área: %.4f\n", area);
        System.out.printf("Perímetro: %.4f\n", perimetro);
        System.out.printf("Diagonal: %.4f", diagonal);

    }
}
