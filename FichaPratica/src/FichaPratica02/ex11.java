package FichaPratica02;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldoAtual, movimentacao, saldoFinal;

        System.out.print("Insira o saldo atual: ");
        saldoAtual = input.nextDouble();
        System.out.print("Insira o valor a creditar/debitar: ");
        movimentacao = input.nextDouble();

        saldoFinal = saldoAtual + movimentacao;

        if (saldoFinal >= 0) {
            System.out.println("O saldo final é: " + saldoFinal);
        } else {
            System.out.println("Operação inválida. Saldo insuficiente.");
        }
    }
}
