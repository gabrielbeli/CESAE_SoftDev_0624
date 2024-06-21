package FichaPratica02Refazendo;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Insira o primeiro numero inteiro: ");
        num1 = input.nextInt();
        System.out.print("Insira o segundo numero inteiro: ");
        num2 = input.nextInt();
        System.out.print("Insira o terceiro numero inteiro: ");
        num3 = input.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println("Os números em ordem crescente são: " + num1 + " " + num2 + " " + num3);

    }
}
