package FichaPratica05;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[3][5];

        for (int X = 0; X < 3; X++) {
            for (int Y = 0; Y < 5; Y++) {
                System.out.print("Insira um numero inteiro: ");
                matriz[X][Y] = input.nextInt();
            }
        }

        int soma = 0;

        for (int X = 0; X < 3; X++) {
            for (int Y = 0; Y < 5; Y++) {
                System.out.print(matriz[X][Y] + " ");
                soma += matriz[X][Y];
            }
            System.out.println();
        }

        System.out.print("\nSoma da matriz: " + soma);
    }
}
