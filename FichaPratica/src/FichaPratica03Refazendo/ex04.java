package FichaPratica03Refazendo;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, count=0;

        System.out.print("Insira um numero inteiro: ");
        number = input.nextInt();

        while (number >= count){
            System.out.print(count);
            count++;
        }
    }
}
