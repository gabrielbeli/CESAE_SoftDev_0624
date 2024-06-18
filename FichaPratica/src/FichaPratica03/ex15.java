package FichaPratica03;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro não-negativo para calcular o fatorial: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Número inválido. Deve ser um número inteiro não-negativo.");
        } else {
            int fatorial = 1;
            int i = 1;

            while (i <= n) {
                fatorial *= i;
                i++;
            }

            System.out.println("Fatorial de " + n + " = " + fatorial);
        }

    }
}
