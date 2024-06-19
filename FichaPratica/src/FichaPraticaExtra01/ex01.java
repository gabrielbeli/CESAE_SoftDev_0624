package FichaPraticaExtra01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;

        System.out.print("Insira sua idade: ");
        age = input.nextInt();

        if( age >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        };
    }
}
