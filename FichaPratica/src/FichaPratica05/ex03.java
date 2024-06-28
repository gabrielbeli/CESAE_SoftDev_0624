package FichaPratica05;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int X = 0; X < vetor.length; X++){
            System.out.print("Insira no Vetor["+X+"]: ");
            vetor[X] = input.nextInt();
        }

        int maiorValor = vetor[0];

        for (int X = 1; X < vetor.length; X++){
            if(vetor[X] > maiorValor){
                maiorValor = vetor[X];
            }
        }

        System.out.println("Maior valor: " + maiorValor);
    }
}
