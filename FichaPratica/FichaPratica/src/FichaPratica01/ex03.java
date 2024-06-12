package FichaPratica01;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base, altura, area, peri;

        System.out.print("Insira um numero: ");
        base = input.nextInt();

        System.out.print("Insira um numero: ");
        altura = input.nextInt();

        area = base * altura ;
        System.out.println("Area: " + area);

        peri = (base + altura) * 2 ;
        System.out.println("Perímetro: " + peri);

    }
}
