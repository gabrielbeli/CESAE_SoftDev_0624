package FichaPratica05;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int X = 0; X < 3; X++) {
            for (int Y = 0; Y < 3; Y++) {
                System.out.print("Insira um numero inteiro: ");
                matriz[X][Y] = input.nextInt();
            }
        }
        System.out.println();

        for (int X = 0; X < 3; X++) {
            for (int Y = 0; Y < 3; Y++) {
                System.out.print(matriz[X][Y] + " ");
            }
            System.out.println();
        }

        int maiorValor = matriz[0][0];
        int menorValor = matriz[0][0];

        for (int X = 0; X < matriz.length; X++) {
            for (int Y = 0; Y < 3; Y++) {
                if (matriz[X][Y] > maiorValor) {
                    maiorValor = matriz[X][Y];
                }
                if (matriz[X][Y] < menorValor) {
                    menorValor = matriz[X][Y];
                }
            }
            System.out.println();
        }

        System.out.println("Maior valor: " + maiorValor + "\nMenor valor: " + menorValor);
    }
}

