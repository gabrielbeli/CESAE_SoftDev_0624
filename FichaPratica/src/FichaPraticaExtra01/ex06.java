package FichaPraticaExtra01;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        System.out.print("Insira um ano: ");
        year = input.nextInt();

        if(year % 4 == 0){
            System.out.println("É bissexto");
        } else {
            System.out.println("Não é bissexto");
        }
    }
}
