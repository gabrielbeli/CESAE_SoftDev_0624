package FichaPratica02Refazendo;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;

        System.out.print("Insira um numero inteiro: ");
        num1 = input.nextInt();

        if (num1 %2 == 0){
            System.out.println("Numero é par");
        } else {
            System.out.println("Numero é impar");
        }
    }
}
