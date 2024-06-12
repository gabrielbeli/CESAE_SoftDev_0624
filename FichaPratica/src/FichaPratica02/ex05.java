package FichaPratica02;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Introduza sua colocação: ");
        num1 = input.nextInt();

        System.out.print("Introduza sua colocação: ");
        num2 = input.nextInt();

        if (num1 < num2) {
            System.out.println("Menor: " + num1 + "\nMaior: " + num2);
        } else {
            System.out.println("Menor:" + num2 + "\nMaior: " + num1);
        }
    }
}
