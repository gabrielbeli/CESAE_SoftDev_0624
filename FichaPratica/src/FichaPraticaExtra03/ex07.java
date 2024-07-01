package FichaPraticaExtra03;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o tamanho do vetor[]: ");
        int[] vetor = new int[input.nextInt()];

        for (int X = 0; X < vetor.length; X++) {
            System.out.print("Insira no Vetor[" + X + "]: ");
            vetor[X] = input.nextInt();
        }

        System.out.println("\n________________________\n");

        for (int X = 0; X < vetor.length; X++) {
            System.out.println("Vetor[" + X + "] = " + vetor[X]);
        }

        System.out.print("\nInsira o numero inteiro para remover: ");
        int numero = input.nextInt();

        int contador = 0;

        for (int X = 0; X < vetor.length; X++) {
            if (vetor[X] == numero) {
                contador++;

                System.out.println( vetor[X] - contador );
            }
        }

        int[] novoVetor = new int[vetor.length - contador];
        int index = 0;

        for (int X = 0; X < vetor.length; X++) {
            if (vetor[X] != numero) {
                novoVetor[index++] = vetor[X];
            }
        }

        System.out.println("\n________________________\n");

        System.out.println("Novo vetor sem o valor " + numero + ":\n");

        for (int X = 0; X < novoVetor.length; X++) {
            System.out.println("Vetor[" + X + "] = " + novoVetor[X]);
        }
    }
}