package FichaPratica02;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1, number2, resultado;
        String opcao;

        System.out.print("Insira a numero real: ");
        number1 = input.nextDouble();
        System.out.print("Insira um numero real: ");
        number2 = input.nextDouble();

        System.out.print("Qual operação quer realizar: ");
        opcao = input.next();

        switch (opcao) {
            case "+":
                resultado = number1 + number2;
                System.out.println("Soma: " + resultado);
                break;
            case "-":
                resultado = number1 - number2;
                System.out.println("Subtração: " + resultado);
                break;
            case "*":
                resultado = number1 * number2;
                System.out.println("Multiplicação: " + resultado);
                break;
            case "/":
                resultado = number1 / number2;
                System.out.println("Divisão: " + resultado);
                break;
            default:
                System.out.println("Operação não aceita");
                break;
        }


    }
}
