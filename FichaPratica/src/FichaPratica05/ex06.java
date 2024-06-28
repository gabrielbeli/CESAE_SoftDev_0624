package FichaPratica05;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int X = 0; X < vetor.length; X++){
            System.out.print("Insira no Vetor["+X+"]: ");
            vetor[X] = input.nextInt();
        }

        boolean crescente=true;

        for (int X = 1; X < vetor.length; X++){
            if(vetor[X] < vetor[X - 1]){
                crescente = false;
            }

        }

        if(crescente){
            System.out.println("É crescente");
        } else {
            System.out.println("Não é crecsente");
        }
    }
}
