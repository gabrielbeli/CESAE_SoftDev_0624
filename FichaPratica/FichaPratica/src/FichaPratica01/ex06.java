package FichaPratica01;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.print("Insira um numero para valor1: ");
        valor1 = input.nextInt();

        System.out.print("Insira um numero para valor2: ");
        valor2 = input.nextInt();

        System.out.println("Valor1: " + valor1);
        System.out.println("Valor2: " + valor2);

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        System.out.println("Valor1: " + valor1);
        System.out.println("Valor2: " + valor2);

    }
}
