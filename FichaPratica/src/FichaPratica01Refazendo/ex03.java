package FichaPratica01Refazendo;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int base, altura, calc;

        System.out.print("Insira o valor da base do retangulo: ");
        base = input.nextInt();

        System.out.print("Insira o valor da altura: ");
        altura = input.nextInt();

        calc = base * altura;
        System.out.println("A area do retangulo é: " + calc);

        calc = (base + altura) * 2;
        System.out.println("O perimetro do retangulo é: " + calc);
    }
}
