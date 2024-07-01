package FichaPraticaExtra03;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int X = 0; X < vetor.length; X++) {
            System.out.print("Insira no Vetor[" + X + "]: ");
            vetor[X] = input.nextInt();
        }

        for (int X = 0; X < vetor.length - 1; X++) {
            for (int Y = 0; Y < vetor.length - 1; Y++) {

                if (vetor[Y] < vetor[Y + 1]) {

                    int temp = vetor[Y];
                    vetor[Y] = vetor[Y + 1];
                    vetor[Y + 1] = temp;
                }
            }
        }

        System.out.println("\n________________________\n");

        for (int X = 0; X < vetor.length; X++) {
            System.out.println("Vetor["+X+"] = "+ vetor[X]);
        }
    }
}
