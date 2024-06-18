package FichaPratica03;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        double sum = 0.0;
        int number;

        while (true) {
            System.out.print("Digite um número (-1 para terminar): ");
            number = input.nextInt();

            if (number == -1) {
                break;
            }

            sum += number;
            count++;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("A média dos números introduzidos é: " + average);
        } else {
            System.out.println("Nenhum número foi introduzido.");
        }
    }
}
