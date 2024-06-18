package FichaPratica03;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count0to25 = 0;
        int count26to50 = 0;
        int count51to75 = 0;
        int count76to100 = 0;

        while (true) {
            System.out.print("Digite um número inteiro positivo (número negativo para terminar): ");
            int number = input.nextInt();

            if (number < 0) {
                break;
            }

            if (number >= 0 && number <= 25) {
                count0to25++;
            } else if (number >= 26 && number <= 50) {
                count26to50++;
            } else if (number >= 51 && number <= 75) {
                count51to75++;
            } else if (number >= 76 && number <= 100) {
                count76to100++;
            }
        }

        System.out.println("Quantidade de números no intervalo [0-25]: " + count0to25);
        System.out.println("Quantidade de números no intervalo [26-50]: " + count26to50);
        System.out.println("Quantidade de números no intervalo [51-75]: " + count51to75);
        System.out.println("Quantidade de números no intervalo [76-100]: " + count76to100);

    }
}
