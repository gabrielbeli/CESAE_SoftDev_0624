package FichaPratica02Refazendo;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;

        System.out.print("""
                Menu: \

                1.Criar
                2.Atualizar
                3.Eliminar
                4.Sair"""
        );

        System.out.print("\n Selecione a opção que deseja: ");
        menu = input.nextInt();

        switch (menu) {
            case 1 -> System.out.println("Criar");
            case 2 -> System.out.println("Atualizar");
            case 3 -> System.out.println("Eliminar");
            case 4 -> System.out.println("Sair");
            default -> System.out.println("Opção inválida");
        }
    }
}
