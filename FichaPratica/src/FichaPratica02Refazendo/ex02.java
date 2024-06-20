package FichaPratica02Refazendo;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario;

        System.out.print("Insira o seu salario: ");
        salario = input.nextDouble();

        if (salario <= 15000.00){
            salario = salario * 0.2;
            System.out.println("Pagar taxa de 20%: " + salario);
        } else {
            salario = salario * 0.3;
            System.out.println("Pagar taxa de 30%: " + salario);
        }
    }
}
