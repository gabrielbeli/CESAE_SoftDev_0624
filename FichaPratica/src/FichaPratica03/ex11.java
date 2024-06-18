package FichaPratica03;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro para o limite (maior que 0): ");
        int limit = input.nextInt();

        System.out.print("Digite um número inteiro para o salto (maior que 0): ");
        int jump = input.nextInt();

        if (limit > 0 && jump > 0) {
            System.out.print("Números de 0 até " + limit + " com incremento de " + jump + ": ");

            for (int i = 0; i <= limit; i += jump) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("O limite e o salto devem ser maiores que 0.");
        }

    }
}
