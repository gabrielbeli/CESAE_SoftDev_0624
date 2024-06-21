package FichaPratica03Refazendo;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, count=0;
        String mess;

        System.out.print("Insira um numero inteiro: ");
        number = input.nextInt();

        System.out.print("Insira uma mensagem: ");
        mess = input.next();

        while (count < number){
            System.out.print(mess);
            count++;
        }
    }
}
