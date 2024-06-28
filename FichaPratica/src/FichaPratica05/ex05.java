package FichaPratica05;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int X = 0; X < vetor.length; X++){
            System.out.print("Insira no Vetor["+X+"]: ");
            vetor[X] = input.nextInt();
        }

        int media = 0;

        for (int X = 0; X < vetor.length; X++){
            media += vetor[X] / 10;
        }

        System.out.print("Media: " + media);
    }
}
