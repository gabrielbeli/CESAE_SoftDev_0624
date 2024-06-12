package FichaPratica02;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Insira um numero inteiro: ");
        num1 = input.nextInt();

        System.out.print("Insira um numero inteiro: ");
        num2 = input.nextInt();

        if (num1 >= num2) {
            System.out.println("Maior: " + num1);
        } else {
            System.out.println("Maior: " + num2);
        }
    }
}