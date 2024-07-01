package FichaPratica05;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[4][4];

        for (int X = 0; X < 4; X++) {
            for (int Y = 0; Y < 4; Y++) {
                System.out.print("Insira um numero inteiro: ");
                matriz[X][Y] = input.nextInt();
            }
        }

        int soma = 0;

        for (int X = 0; X < 4; X++) {
            for (int Y = 0; Y < 4; Y++) {
                System.out.print(matriz[X][Y] + " ");
                soma = matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3];
            }
            System.out.println();
        }

        System.out.print("\nSoma da matriz: " + soma);
    }
}
