package FichaPratica02;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um valor em euros (múltiplo de 5): ");
        int valor = input.nextInt();

        if (valor % 5 != 0) {
            System.out.println("O valor deve ser um múltiplo de 5.");
            return;
        }

        System.out.println("Valor lido: " + valor + " euros");
        System.out.println("Relação de notas necessárias:");

        if (valor >= 200) {
            System.out.println("Notas de 200: " + (valor / 200));
            valor %= 200;
        }
        if (valor >= 100) {
            System.out.println("Notas de 100: " + (valor / 100));
            valor %= 100;
        }
        if (valor >= 50) {
            System.out.println("Notas de 50: " + (valor / 50));
            valor %= 50;
        }
        if (valor >= 20) {
            System.out.println("Notas de 20: " + (valor / 20));
            valor %= 20;
        }
        if (valor >= 10) {
            System.out.println("Notas de 10: " + (valor / 10));
            valor %= 10;
        }
        if (valor >= 5) {
            System.out.println("Notas de 5: " + (valor / 5));
        }
    }
}
