package EstruturasCondicionais;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        int num1 = read.nextInt();
        System.out.println("Digite o 2º número");
        int num2 = read.nextInt();
        int div = num1 / num2;
        int rest = div % 2;

        if (rest == 0) {
            System.out.printf("%d é multiplo de %d\n", num1, num2);
        } else {
            System.out.printf("%d não é multiplo de %d\n", num1, num2);
        }
    }
}
