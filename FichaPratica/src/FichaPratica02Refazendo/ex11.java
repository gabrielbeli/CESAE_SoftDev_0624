package FichaPratica02Refazendo;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo, movimento, saldoFinal;

        System.out.print("Insira seu saldo: ");
        saldo = input.nextDouble();
        System.out.print("Insira o valor de movimento debito/credito: ");
        movimento = input.nextDouble();

        saldoFinal = saldo + movimento;

        if(saldoFinal > 0) {
            System.out.println("Saldo atual: " + saldoFinal);
        } else {
            System.out.println("Operação inválida: " + "\nSaldo atual: " + saldo);
        }
    }
}
