package FichaPratica02;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3;

        System.out.print("Insira a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.print("Insira a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.print("Insira a terceira nota: ");
        nota3 = input.nextDouble();

        if (((nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.45)) >= 9.5){
            System.out.println("Você foi aprovado");
        } else {
            System.out.println("Você não foi aprovado");
        }
    }
}
