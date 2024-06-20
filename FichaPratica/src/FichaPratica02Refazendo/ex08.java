package FichaPratica02Refazendo;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double note1, note2, note3;

        System.out.print("Insira sua primeira nota (0-20): ");
        note1 = input.nextDouble();

        System.out.print("Insira sua segunda nota (0-20): ");
        note2 = input.nextDouble();

        System.out.print("Insira sua terceira nota (0-20): ");
        note3 = input.nextDouble();

        if ((note1 * 0.25) + (note2 * 0.35) + (note3 + 0.4) >= 9.5) {
            System.out.println("SVocê foi aprovado");
        } else {
            System.out.println("Você foi reprovado");
        }

    }
}
