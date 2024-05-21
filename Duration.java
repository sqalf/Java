package EstruturasCondicionais;

import java.util.Scanner;

public class Duration {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite a hora inicial: ");
        int horaInicial = read.nextInt();
        System.out.println("Digite a hora final: ");
        int horaFinal = read.nextInt();
        read.close();

        int duration;

        if (horaInicial < horaFinal) {
            duration = horaFinal - horaInicial;
        } else {
            duration = 24 - horaInicial + horaFinal;
        }
        System.out.printf("A duração foi de %d horas\n", duration);
    }
}
