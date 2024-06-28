package FichaPratica05;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[3][5];

        for (int X = 0; X < 3; X++) {
            for (int Y = 0; Y < 5; Y++) {
                System.out.print("Insira um numero inteiro: ");
                matriz[X][Y] = input.nextInt();
            }
        }
        System.out.println();

        for (int X = 0; X < 3; X++) {
            for (int Y = 0; Y < 5; Y++) {
                System.out.print(matriz[X][Y] + " ");
            }
            System.out.println();
        }

        System.out.print("\nInsira um numero inteiro para verificar quantas vezes ele aparece: ");
        int numero = input.nextInt();

        int contador = 0;

        for (int X = 0; X < 3; X++) {
            for (int Y = 0; Y < 5; Y++) {
                if (matriz[X][Y] == numero) {
                    contador++;
                }
            }
        }

        System.out.println("O numero " + numero + " aparece " + contador + " vez(es)");
    }
}
