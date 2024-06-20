package FichaPratica02Refazendo;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int position;

        System.out.print("Insira o seu salario: ");
        position = input.nextInt();

        switch (position){
            case 1 -> System.out.println("Ganhou 10 pontos");
            case 2 -> System.out.println("Ganhou 8 pontos");
            case 3 -> System.out.println("Ganhou 6 pontos");
            case 4 -> System.out.println("Ganhou 5 pontos");
            case 5 -> System.out.println("Ganhou 4 pontos");
            case 6 -> System.out.println("Ganhou 3 pontos");
            case 7 -> System.out.println("Ganhou 2 pontos");
            case 8 -> System.out.println("Ganhou 1 pontos");
            default -> System.out.println("Não ganhou pontos");
        }
    }
}
