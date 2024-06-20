package FichaPratica02Refazendo;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, resultado;

        String operation;

        System.out.print("Insira um numero: ");
        num1 = input.nextDouble();
        System.out.print("Insira outro numero: ");
        num2 = input.nextDouble();

        System.out.print("Insira a operção que desja realizar (+ , - , *, /): ");
        operation = input.next();

        switch (operation){
            case "+": resultado = (num1 + num2);
                System.out.println("Soma: " + resultado);
                break;
            case "-": resultado = (num1 - num2);
                System.out.println("Subtração: " + resultado);
                break;
            case "*": resultado = (num1 * num2);
                System.out.println("Soma: " + resultado);
                break;
            case "/": resultado = (num1 / num2);
                System.out.println("Soma: " + resultado);
                break;
        }

    }
}
