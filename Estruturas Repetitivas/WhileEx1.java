package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        double senha = 0;
        System.out.println("digite a senha: ");

        while (senha != 2002) {
            senha = read.nextDouble();
            System.out.println("Senha Inválida:");
        }
        System.out.println("Acesso permitido");
    }
}
