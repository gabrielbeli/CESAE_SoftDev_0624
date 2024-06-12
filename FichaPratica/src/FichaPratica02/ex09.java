package FichaPratica02;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2, number3;

        System.out.print("Insira a primeiro numero: ");
        number1 = input.nextInt();
        System.out.print("Insira a segunda numero: ");
        number2 = input.nextInt();
        System.out.print("Insira a terceira numero: ");
        number3 = input.nextInt();

        if (number1 < number2 && number1 < number3) {
            System.out.println("Menor: " + number1);
        }

        if (number2 < number3 && number2 < number1) {
            System.out.println("Menor: " + number2);
        }

        if (number3 < number2 && number3 < number1) {

            System.out.println("Menor: " + number3);
        }
    }
}
