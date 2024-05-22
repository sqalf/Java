package EstruturasCondicionais;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite a 1ª nota: ");
        double nota1 = read.nextDouble();
        System.out.println("Digite a 2ª nota: ");
        double nota2 = read.nextDouble();
        System.out.println("Digite a 3ª nota: ");
        double nota3 = read.nextDouble();
        System.out.println("Digite a 4ª nota: ");
        double nota4 = read.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 6) {
            System.out.printf("Nota final: %.1f ---> Aprovado\n", media);
        } else {
            System.out.printf("Nota final: %.1f ---> Reprovado\n", media);
        }

    }
}
