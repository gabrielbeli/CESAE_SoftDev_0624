package FichaPratica03;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = input.nextInt();

        for (int i = number - 5; i < number; i++) {
            System.out.print(i + " ");
        }

        for (int i = number + 1; i <= number + 5; i++) {
            System.out.print(i + " ");
        }
        
    }
}
