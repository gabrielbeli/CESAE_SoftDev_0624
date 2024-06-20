package FichaPratica01Refazendo;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, number2, operacao;

        System.out.print("Insira um numero inteiro: ");
        number = input.nextInt();

        System.out.print("Insira outro numero inteiro: ");
        number2 = input.nextInt();

        operacao = number + number2;
        System.out.println("A soma dos numeros é: " + operacao);

        operacao = number - number2;
        System.out.println("A subtração dos numeros é: " + operacao);

        operacao = number * number2;
        System.out.println("A multiplicação dos numeros é: " + operacao);

        operacao = number / number2;
        System.out.println("A divisão dos numeros é: " + operacao);

    }
}
