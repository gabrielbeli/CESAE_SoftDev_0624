package FichaPratica01;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minutesM1, secondsM1, minutesM2, secondsM2, minutesM3, secondsM3, minutesM4, secondsM4, minutesM5, secondsM5, totalSeconds;

        System.out.print("Minutos faixa 1: ");
        minutesM1 = input.nextInt();

        System.out.print("Segundos faixa 1: ");
        secondsM1 = input.nextInt();

        System.out.print("Minutos faixa 2: ");
        minutesM2 = input.nextInt();

        System.out.print("Segundos faixa 2: ");
        secondsM2 = input.nextInt();

        System.out.print("Minutos faixa 3: ");
        minutesM3 = input.nextInt();

        System.out.print("Segundos faixa 3: ");
        secondsM3 = input.nextInt();

        System.out.print("Minutos faixa 4: ");
        minutesM4 = input.nextInt();

        System.out.print("Segundos faixa 4: ");
        secondsM4 = input.nextInt();

        System.out.print("Minutos faixa 5: ");
        minutesM5 = input.nextInt();

        System.out.print("Segundos faixa 5: ");
        secondsM5 = input.nextInt();

        totalSeconds = (minutesM1 * 60 + secondsM1) +
                       (minutesM2 * 60 + secondsM2) +
                       (minutesM3 * 60 + secondsM3) +
                       (minutesM4 * 60 + secondsM4) +
                       (minutesM5 * 60 + secondsM5);

        int horas = totalSeconds / 3600;
        int secondsRestates = totalSeconds % 3600;
        int minutes = secondsRestates / 60;
        int seconds = secondsRestates % 60;

        System.out.println("Duração total do álbum: " + horas + "h" + minutes + "m" + seconds + "s");

    }
}
