package FichaPratica05;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int X = 0; X < vetor.length; X++){
            System.out.print("Insira no Vetor["+X+"]: ");
            vetor[X] = input.nextInt();
        }

        int menorValor = vetor[0];

        for (int X = 1; X < vetor.length; X++){
            if(vetor[X] < menorValor){
                menorValor = vetor[X];
            }
        }
            System.out.println("O menor valor é: " + menorValor);
        }

    }

