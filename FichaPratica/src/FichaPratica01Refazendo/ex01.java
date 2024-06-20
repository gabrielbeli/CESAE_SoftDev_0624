package FichaPratica01Refazendo;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, number2, soma;

        System.out.print("Insira um numero inteiro: ");
        number = input.nextInt();

        System.out.print("Insira outro numero inteiro: ");
        number2 = input.nextInt();

        soma = number + number2;
        System.out.println("A soma dos numeros é: " + soma);
    }
}
