package FichaPratica01;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price1, price2, price3, pay, total;

        System.out.print("Insira um numero: ");
        price1 = input.nextInt();

        System.out.print("Insira um numero: ");
        price2 = input.nextInt();

        System.out.print("Insira um numero: ");
        price3 = input.nextInt();

        pay = (price1 + price2 + price3);

        total = pay - ( pay * 0.1 );

        System.out.println("Valor a pagar: " + total );

    }
}
