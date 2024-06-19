package FichaPraticaExtra01;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price;

        System.out.print("Insira o preço do produto: ");
        price = input.nextDouble();

        if(price > 100.00) {
            price = price * (-0.1) + price;

            System.out.println("Preço final: " + price + " com desconto");
        } else {
            System.out.println("Preço final: " + price + " sem desconto de 10%");
        }
    }
}
