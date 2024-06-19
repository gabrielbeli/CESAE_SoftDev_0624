package FichaPraticaExtra01;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String alpha;

        System.out.print("Insira uma letra: ");
        alpha = input.next();

        if (alpha.equals("a")) {
            System.out.println("é uma vogal");
        }
        if (alpha.equals("e")) {
            System.out.println("é uma vogal");
        }
        if (alpha.equals("i")) {
            System.out.println("é uma vogal");
        }
        if (alpha.equals("o")) {
            System.out.println("é uma vogal");
        }
        if (alpha.equals("u")) {
            System.out.println("é uma vogal");
        }
        else {
            System.out.println("é uma consoante");
        }
    }

}

