package FichaPratica02;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hour24, minute;
        int hour12;
        String period;

        System.out.print("Insira a hora (formato 24 horas): ");
        hour24 = input.nextInt();
        System.out.print("Insira os minutos: ");
        minute = input.nextInt();

        if (hour24 == 0) {
            hour12 = 12;
            period = "AM";
        } else if (hour24 < 12) {
            hour12 = hour24;
            period = "AM";
        } else if (hour24 == 12) {
            hour12 = 12;
            period = "PM";
        } else {
            hour12 = hour24 - 12;
            period = "PM";
        }

        System.out.printf("Resultado: " + hour12 + ":" + minute + " " + period);
    }
}
