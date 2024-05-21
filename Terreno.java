package EstruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("digite a largura do terreno: ");
        double larguraTerreno = read.nextDouble();

        System.out.println("digite o comprimento do terreno: ");
        double comprimentoTerreno = read.nextDouble();

        System.out.println("digite em metros quadrados o valor do terreno: ");
        double metroQuadrado = read.nextDouble();

        double areaTerreno = larguraTerreno * comprimentoTerreno;
        double precoTerreno = areaTerreno * metroQuadrado;

        System.out.printf("Área do terreno: %.2f\n", areaTerreno);
        System.out.printf("Preço do terreno: %.2f\n", precoTerreno);

    }
}
