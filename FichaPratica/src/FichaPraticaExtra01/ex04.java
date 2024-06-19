package FichaPraticaExtra01;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String alpha;

        System.out.print("Insira uma letra: ");
        alpha = input.next().toLowerCase();

        if (alpha.length() == 1 && Character.isLetter(alpha.charAt(0))) {
            switch (alpha){
                case "a", "e", "i", "o", "u" ->
                    System.out.println("é uma vogal");
                default ->
                    System.out.println("é uma consoante");
        }} else {
            System.out.println("Entrada inválida. Por favor, insira uma única letra.");
        }
    }
}

