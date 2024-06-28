package FichaPratica05;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] vetor = new double[12];

        for (int X = 0; X < vetor.length; X++){
            System.out.print("Insira no Vetor["+X+"]: ");
            vetor[X] = input.nextDouble();
        }

        double soma = 0;

        for (int X = 0; X < vetor.length; X++){
            soma += vetor[X];
        }

        System.out.print("Salario anual: " + soma);

    }
}
