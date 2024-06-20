package FichaPraticaExtra01;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 15;

        System.out.print("Insira um numero entre 1 e 100: ");
        number = input.nextInt();

        if (number != 15) {

            if (number < 10) {
                System.out.println("Tá baixo");

                System.out.print("Insira um numero entre 1 e 100: ");
                number = input.nextInt();

                System.out.print("Ta baixo! Só tem mais uma chance. ");
                System.out.print(" \nInsira um numero entre 1 e 100: ");
                number = input.nextInt();

                if (number == 15) {
                    System.out.print("Você ganhou!");
                } else {
                    System.out.print("Você perdeu!");
                }

            }

            if (number > 20) {
                System.out.println("Tá alto");

                System.out.print("Insira um numero entre 1 e 100: ");
                number = input.nextInt();

                System.out.print("Tá alto. Só tem mais uma chance. ");
                System.out.print("\nInsira um numero entre 1 e 100: ");
                number = input.nextInt();

                if (number == 15) {
                    System.out.print("Você ganhou!");
                } else {
                    System.out.print("Você perdeu!");
                }
            }

        } else {
            System.out.println("Voce ganhou!");
        }

    }
}
