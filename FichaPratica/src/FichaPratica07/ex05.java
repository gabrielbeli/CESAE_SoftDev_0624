package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.LibraryFiles.imprimirFicheiro;

public class ex05 {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("\nO seu ficheiro contem: ");
        imprimirFicheiro("Ficheiros/exercicio_05_31.txt");

        File ficheiro = new File("Ficheiros/exercicio_05_31.txt");
        Scanner fileScanner = new Scanner(ficheiro);

        int numAtual, soma = 0;

        while (fileScanner.hasNextInt()) {
            numAtual = fileScanner.nextInt();
            soma += numAtual;
        }

        System.out.println("A soma dos numeros contidos no ficheiro é: " + soma);

    }
}
