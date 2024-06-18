package FichaPratica03;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número (ou qualquer número negativo para terminar): ");
        int numberAtual = input.nextInt();

        boolean emOrdemCrescente = true;
        int numberAnterior = numberAtual;

        while (numberAtual >= 0) {
            System.out.print("Digite outro número (ou qualquer número negativo para terminar): ");
            numberAtual = input.nextInt();

            if (numberAtual < 0) {
                break;
            }

            if (numberAtual < numberAnterior) {
                emOrdemCrescente = false;
            }

            numberAnterior = numberAtual;
        }

        if (emOrdemCrescente) {
            System.out.println("A sequência está em ordem crescente.");
        } else {
            System.out.println("A sequência não está em ordem crescente.");
        }
    }
}
