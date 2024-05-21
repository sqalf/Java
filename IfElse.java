package EstruturasCondicionais;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite a hora: ");
        double hora = read.nextDouble();

        if (hora < 12) {
            System.out.println("Manhã");
        } else if (hora >= 12 && hora < 18.00) {
            System.out.println("Tarde");
        } else {
            System.out.println("Noite");
        }
    }
}
