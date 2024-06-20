package FichaPratica01Refazendo;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raio, pi = 3.4, calc;

        System.out.print("Insira o valor do raraio: ");
        raio = input.nextDouble();

        calc = (raio * raio) * pi;
        System.out.println("A area do retangulo é: " + calc);

    }
}

