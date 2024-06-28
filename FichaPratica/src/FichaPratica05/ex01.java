package FichaPratica05;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int X = 0; X < vetor.length; X++){
            System.out.print("Insira no Vetor["+X+"]: ");
            vetor[X] = input.nextInt();
        }

        System.out.println("\n________________________\n");

        for (int X = 0; X < vetor.length; X++) {
            System.out.println("Vetor["+X+"] = "+ vetor[X]);
        }


    }
}