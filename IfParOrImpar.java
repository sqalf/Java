package EstruturasCondicionais;

import java.util.Scanner;

public class IfParOrImpar {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = read.nextInt();
        int rest = num % 2;

        if (num > 0 && rest == 0) {
            System.out.printf("%d é Par\n", num);
        } else {
            System.out.printf("%d é Ímpar\n", num);
        }
    }
}
