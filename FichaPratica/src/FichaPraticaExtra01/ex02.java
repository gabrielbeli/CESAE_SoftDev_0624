package FichaPraticaExtra01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight;

        System.out.print("Insira seu peso (kg): ");
        weight = input.nextDouble();

        if(weight > 0) {
            weight = weight * 0.16;
        } System.out.println("Seu peso lunar igual: " + weight);

    }
}
