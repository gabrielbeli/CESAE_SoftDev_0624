package FichaPratica01;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, mediaA, mediaP;

        System.out.print("Insira um numero: ");
        nota1 = input.nextInt();

        System.out.print("Insira um numero: ");
        nota2 = input.nextInt();

        System.out.print("Insira um numero: ");
        nota3 = input.nextInt();

        mediaA = (nota1 + nota2 +nota3) / 3;

        System.out.println("Média aritimetica: " + mediaA);

        mediaP = ((nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5) );

        System.out.println("Média ponderada: " + mediaP);

    }
}
