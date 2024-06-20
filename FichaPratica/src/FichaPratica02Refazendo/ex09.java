package FichaPratica02Refazendo;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Insira um numero inteiro: ");
        num1 = input.nextInt();
        System.out.print("Insira um numero inteiro: ");
        num2 = input.nextInt();
        System.out.print("Insira um numero inteiro: ");
        num3 = input.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println("Menor: " + num1);
        }
        if (num2 < num3 && num2 < num1) {
            System.out.println("Menor: " + num2);
        }
        if (num3 < num2 && num3 < num1) {
            System.out.println("Menor: " + num3);
        }
    }
}
