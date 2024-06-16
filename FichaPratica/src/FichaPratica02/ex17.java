package FichaPratica02;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o saldo médio do cliente: ");
        double saldoMedio = input.nextDouble();

        double creditoEspecial = 0.0;

        if (saldoMedio >= 0 && saldoMedio <= 2000) {
            creditoEspecial = 0.0;
        } else if (saldoMedio > 2000 && saldoMedio <= 4000) {
            creditoEspecial = saldoMedio * 0.20;
        } else if (saldoMedio > 4000 && saldoMedio <= 6000) {
            creditoEspecial = saldoMedio * 0.30;
        } else if (saldoMedio > 6000) {
            creditoEspecial = saldoMedio * 0.40;
        }

        System.out.println("Saldo Médio: " + saldoMedio + " euros");
        System.out.println("Valor do crédito especial: " + creditoEspecial + " euros");
    }
}
