package EstruturasRepetitivas;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int soma = 0;

        for (int i = 0; i <= 5; i++) {
            i = read.nextInt();
            soma += i;
        }
        System.out.println("soma: " + soma);
    }
}
