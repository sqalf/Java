package EstruturasCondicionais;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = read.nextInt();
        read.close();
        String dia;

        switch (num) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
                break;
        }
        System.out.printf("%s\n", dia);
    }
}
