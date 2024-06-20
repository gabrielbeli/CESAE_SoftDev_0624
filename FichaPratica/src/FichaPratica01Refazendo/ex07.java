package FichaPratica01Refazendo;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor1, valor2, valor3, priceFinal;

        System.out.print("Insira o valor do primeiro produto: ");
        valor1 = input.nextDouble();

        System.out.print("Insira o valor do segundo produto: ");
        valor2 = input.nextDouble();

        System.out.print("Insira o valor do terceriro produto: ");
        valor3 = input.nextDouble();

        priceFinal = valor1 + valor2 + valor3;
        priceFinal = priceFinal - ( priceFinal * 0.1 );

        System.out.println("Valor a pagar com desconto de 10%: " + priceFinal);
    }
}
