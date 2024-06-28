package FichaPratica05;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[3][3];

        for (int X = 0; X < 3; X++) {
            for (int Y = 0; Y < 3; Y++) {
                System.out.print("Insira um numero inteiro: ");
                matriz[X][Y] = input.nextInt();
            }
        }
        System.out.println("\nMatriz 3x3:\n");

        for (int X = 0; X < 3; X++) {
            for (int Y = 0; Y < 3; Y++) {
                System.out.print(matriz[X][Y] + " ");
            }
            System.out.println();
        }
    }
}
