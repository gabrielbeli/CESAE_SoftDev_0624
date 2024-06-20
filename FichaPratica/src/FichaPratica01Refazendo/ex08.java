package FichaPratica01Refazendo;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minutes1, seconds1, minutes2, seconds2, minutes3, seconds3, minutes4, seconds4, minutes5, seconds5, totalSeconds;

        System.out.print("Insira os minutos da primeira musica: ");
        minutes1 = input.nextInt();
        System.out.print("Insira os minutos da primeira musica: ");
        seconds1 = input.nextInt();

        System.out.print("Insira os minutos da primeira musica: ");
        minutes2 = input.nextInt();
        System.out.print("Insira os minutos da primeira musica: ");
        seconds2 = input.nextInt();

        System.out.print("Insira os minutos da primeira musica: ");
        minutes3 = input.nextInt();
        System.out.print("Insira os minutos da primeira musica: ");
        seconds3 = input.nextInt();

        System.out.print("Insira os minutos da primeira musica: ");
        minutes4 = input.nextInt();
        System.out.print("Insira os minutos da primeira musica: ");
        seconds4 = input.nextInt();

        System.out.print("Insira os minutos da primeira musica: ");
        minutes5 = input.nextInt();
        System.out.print("Insira os minutos da primeira musica: ");
        seconds5 = input.nextInt();

        totalSeconds = (minutes1 * 60 + seconds1) +
                (minutes2 * 60 + seconds2) +
                (minutes3 * 60 + seconds3) +
                (minutes4 * 60 + seconds4) +
                (minutes5 * 60 + seconds5);

        int horas = totalSeconds / 3600;
        int secondsRestates = totalSeconds % 3600;
        int minutes = secondsRestates / 60;
        int seconds = secondsRestates % 60;

        System.out.println("Duração total do álbum: " + horas + "h" + minutes + "m" + seconds + "s");

    }
}
