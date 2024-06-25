package FichaPratica04;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, calc;
        String operacao= "", continuar = "";

        System.out.print("Introduza o primeiro valor: ");
        num1 = input.nextDouble();

        System.out.print("Introduza o primeiro valor: ");
        num2 = input.nextDouble();

        do {
            System.out.print("Selecione a operação desejada ( +, -, *, / )");

            switch (operacao){
                case "+" -> System.out.println("A soma dos valores é igual: " + (calc = num1 + num2));
                case "-" -> System.out.println("A subtração dos valores é igual: " + (calc = num1 - num2));
                case "*" -> System.out.println("A multiplicação dos valores é igual: " + (calc = num1 * num2));
                case "/" -> System.out.println("A divisão dos valores é igual: " + (calc = num1 / num2));
                default -> System.out.println("Operação invalida");
            }

        } while();

    }
}
