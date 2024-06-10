package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int x = -2;
        int y = -1;

        while (x != 0 && y != 0) {
            x = read.nextInt();
            y = read.nextInt();
            System.out.println(x + " ," + y);
        }

    }
}
