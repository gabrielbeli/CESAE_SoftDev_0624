package FichaPratica03;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que 2: ");
        int number = input.nextInt();

        if (number > 2) {
            System.out.print("Números pares entre 2 e " + number + ": ");

            for (int i = 2; i <= number; i += 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("O número deve ser maior que 2.");
        }
    }
}
