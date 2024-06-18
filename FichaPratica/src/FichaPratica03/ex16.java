package FichaPratica03;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro não-negativo para calcular o fatorial: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Número inválido. Deve ser um número inteiro não-negativo.");
        } else {
            int fatorial = 1;
            int multiplicador = 1;

            while (multiplicador <= n) {
                fatorial = somaSemMultiplicacao(fatorial, multiplicador);
                multiplicador++;
            }

            System.out.println("Fatorial de " + n + " = " + fatorial);
        }

    }

    public static int somaSemMultiplicacao(int x, int y) {
        int resultado = 0;
        for (int i = 0; i < y; i++) {
            resultado += x;
        }
        return resultado;
    }
}
