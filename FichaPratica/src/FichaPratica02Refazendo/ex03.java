package FichaPratica02Refazendo;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario;

        System.out.print("Insira o seu salario: ");
        salario = input.nextDouble();

        if (salario <= 15000.00){
            salario = salario * 0.2;
        }
        if (salario <= 20000.00){
            salario = salario * 0.3;
        }
        if (salario <= 25000.00){
            salario = salario * 0.35;
        }
        if (salario > 25000.00){
            salario = salario * 0.4;
        } System.out.println("Pagar de taxa: " + salario);
    }
}
