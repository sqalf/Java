package EstruturasRepetitivas;

import java.util.Scanner;

public class ForEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um número: ");
        int num = sc.nextInt();
        int result;

        for (int i = 1; i <= 10; i++) {
            result = num * i;
            System.out.println(num);
        }

    }
}
