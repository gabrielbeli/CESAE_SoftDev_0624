package FichaPraticaExtra03;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int X = 0; X < vetor.length; X++) {
            System.out.print("Insira no Vetor[" + X + "]: ");
            vetor[X] = input.nextInt();
        }

        System.out.println("\n________________________\n");

        boolean encontrado = false; // Variável para verificar se há duplicatas
        boolean[] verificado = new boolean[vetor.length]; // Vetor auxiliar para marcar elementos verificados

        System.out.println("\nValores que aparecem mais de uma vez:");

        for (int X = 0; X < vetor.length; X++) {
            if (!verificado[X]) { // Verificar apenas os elementos que ainda não foram marcados
                int count = 1;
                for (int Y = X + 1; Y < vetor.length; Y++) {
                    if (vetor[X] == vetor[Y]) {
                        verificado[Y] = true;
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println("O valor " + vetor[X] + " aparece " + count + " vezes.");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Não há valores que aparecem mais de uma vez.");
        }
    }
}