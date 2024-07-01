package FichaPratica05;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        int[] vetor2 = new int[10];

        for (int X = 0; X < 10; X++) {
            System.out.print("Insira no Vetor[" + X + "]: ");
            vetor[X] = input.nextInt();
        }

        for (int X = 0; X < 10; X++) {
            System.out.print("Insira no Vetor[" + X + "]: ");
            vetor2[X] = input.nextInt();
        }

        int[][] matriz = new int[10][2];

        for (int X = 0; X < 10; X++) {
            matriz[X][0] = vetor[X];
            matriz[X][1] = vetor2[X];
        }

        for (int X = 0; X < matriz.length; X++) {
            for (int Y = 0; Y < matriz[X].length; Y++) {
                System.out.print(matriz[X][Y] + " ");
            }
            System.out.println();
        }


    }
}
