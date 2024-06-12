package FichaPratica02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario, pay;

        System.out.print("Insira o salário: ");
        salario = input.nextDouble();

        if (salario <= 15000) {
            pay = (salario * 0.20 );
        } else {
            pay = (salario * 0.30 );
        } System.out.println("Pagar: " + pay);
    }
}
