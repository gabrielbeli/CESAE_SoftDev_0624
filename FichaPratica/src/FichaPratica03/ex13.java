package FichaPratica03;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de início do intervalo: ");
        int start = input.nextInt();

        System.out.print("Digite o valor de fim do intervalo: ");
        int end = input.nextInt();

        if (start <= end) {
            System.out.print("Múltiplos de 5 entre " + start + " e " + end + ": ");

            for (int i = start; i <= end; i++) {
                if (i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("O valor de início deve ser menor ou igual ao valor de fim.");
        }
    }
}
