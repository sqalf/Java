package EstruturasRepetitivas;

import java.util.Scanner;

public class ForEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite 1 numero: ");

        for (int x = sc.nextInt(); 1 <= x; x--) {
            int rest = x % 2;
            if (rest != 0){
                System.out.println(x);
            }
            else{

            }
        }

    }
}
