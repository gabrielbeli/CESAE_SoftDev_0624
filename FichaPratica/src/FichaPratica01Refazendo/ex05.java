package FichaPratica01Refazendo;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, calc;

        System.out.print("Insira o valor da primeira nota: ");
        nota1 = input.nextDouble();
        System.out.print("Insira o valor da primeira nota: ");
        nota2 = input.nextDouble();
        System.out.print("Insira o valor da primeira nota: ");
        nota3 = input.nextDouble();

        calc = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua média é: " + calc);

        calc = (nota1 * 0.2 ) + (nota2 * 0.3 ) + (nota3 * 0.5);
        System.out.println("Sua média ponderada é: " + calc);

    }
}
