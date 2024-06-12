package FichaPratica01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, soma, sub, multi, div;

        System.out.print("Insira um numero: ");
        num1 = input.nextInt();

        System.out.print("Insira um numero: ");
        num2 = input.nextInt();

        soma = num1 + num2;
        System.out.println("Soma: " + soma);

        sub = num1 + num2;
        System.out.println("Subtração: " + sub);

        multi = num1 + num2;
        System.out.println("Multiplicação: " + multi);

        div = num1 + num2;
        System.out.println("Divisão: " + div);

    }

}
