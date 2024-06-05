package EstruturasRepetitivas;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int soma = 0;

        while (num != 0) {
            soma += num;
            num = read.nextInt();
        }
        read.close();
        System.out.println("Soma: " + soma);
    }
}
