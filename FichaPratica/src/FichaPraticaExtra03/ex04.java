package FichaPraticaExtra03;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int X = 0; X < vetor.length; X++) {
            System.out.print("Insira no Vetor[" + X + "]: ");
            vetor[X] = input.nextInt();
        }

        System.out.println("\n________________________\n");

        for (int X = 0; X < vetor.length; X++) {
            System.out.println("Vetor[" + X + "] = " + vetor[X]);
        }

        System.out.print("\nInsira um numero inteiro para verificar se ele aparece: ");
        int numero = input.nextInt();

        int contador = 0;

        for (int X = 0; X < vetor.length; X++) {
            if (vetor[X] == numero) {
                contador++;
            }
        }
        System.out.println("O numero " + numero + " aparece " + contador + "vezes");
    }
}
