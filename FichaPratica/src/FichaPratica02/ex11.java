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

        if (movimentacao < 0){
            saldoFinal = saldoAtual - movimentacao;
            System.out.print("O saldo final é: " + saldoFinal);
        } else {
            saldoFinal = saldoAtual + movimentacao;
            System.out.print("O saldo final é: " + saldoFinal);
        }
    }
}
