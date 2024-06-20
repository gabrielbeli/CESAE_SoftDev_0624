package FichaPratica02Refazendo;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Insira um numero inteiro: ");
        num1 = input.nextInt();

        System.out.print("Insira um numero inteiro: ");
        num2 = input.nextInt();

        if (num2 > num1){
            System.out.println("Maior: " + num2 + "\nMenor: " + num1);
        } else {
            System.out.println("Maior: " + num1 + "\nMenor: " + num2);
        }
    }
}
