package FichaPratica02;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario, pay = 0;

        System.out.print("Insira o salário: ");
        salario = input.nextDouble();

        if (salario < 15000) {
            pay = (salario * 0.2 );
        } else {
        if ((salario >= 15000) && salario < 20000) {
            pay = (salario * 0.3 );
        }} 
        if ((salario >= 20000) && salario <= 25000) {
            pay = (salario * 0.35 );
        } else {
        if (salario > 25000)  {
            pay = (salario * 0.40 );
        }}System.out.println("Pagar: " + pay);
    }
}

//15 a 20 30%
//20 a 25 35%
//25 a 30 40%

