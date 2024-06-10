package EstruturasRepetitivas;

import java.util.Scanner;

public class WhileEx3_Switch {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0, tipo = 0;
        System.out.println("Digite o númro correspondente: ");
        System.out.println("1 - Alcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Finalizar");

        while (tipo != 4) {
            switch (tipo) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
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
