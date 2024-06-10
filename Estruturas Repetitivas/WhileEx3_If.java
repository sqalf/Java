package EstruturasRepetitivas;

import java.util.Scanner;

public class WhileEx3_If {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0, tipo = 0;
        System.out.println("1 - Alcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Finalizar");

        while (tipo != 4) {
            if (tipo == 1) {
                alcool += 1;
            } else if (tipo == 2) {
                gasolina += 1;
            } else if (tipo == 3) {
                diesel += 1;
            }

            tipo = read.nextInt();
        }

        read.close();
        System.out.println("Muito obrigado!");
        System.out.printf("Alcool: %d clientes\n", alcool);
        System.out.printf("Gasolina: %d clientes\n", gasolina);
        System.out.printf("Diesel: %d clientes\n", diesel);
    }
}