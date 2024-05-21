package EstruturasCondicionais;

import java.util.Scanner;

public class IfNegativeOrPositive {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int num = read.nextInt();

        if (num < 0) {
            System.out.printf("%d é Negativo\n", num);
        } else {
            System.out.printf("%d é Positivo\n", num);
        }

    }
}
