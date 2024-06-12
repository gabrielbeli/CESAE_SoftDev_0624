package FichaPratica01;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio, pi = 3.14, area;

        System.out.print("Insira um numero: ");
        raio = input.nextInt();

        area = pi * (raio * raio);

        System.out.println("Area: " + area);

    }
}
