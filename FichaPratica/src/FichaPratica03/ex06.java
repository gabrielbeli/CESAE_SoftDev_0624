package FichaPratica03;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1,number2;

        System.out.print("Insira um numero inicial: ");
        number1 = input.nextInt();

        System.out.print("Insira o numero final: ");
        number2 = input.nextInt();

        while (number1 <= number2) {
            System.out.print(number1);
            number1 = number1 + 1;
        }
    }
}
