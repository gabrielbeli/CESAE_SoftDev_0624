package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.LibraryFiles.imprimirFicheiro;

public class ex07 {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("\nO seu ficheiro contem: \n");
        imprimirFicheiro("Ficheiros/exercicio_07.txt");

        File ficheiro = new File("Ficheiros/exercicio_07.txt");

        Scanner fileScanner = new Scanner(ficheiro);
        Scanner scannerPalavras = new Scanner(ficheiro);

        int contadorLinhas=0, contadorPalavras=0;

        while (fileScanner.hasNextLine()){
            contadorLinhas++;
            fileScanner.nextLine();
        }

        while(scannerPalavras.hasNext()){
            contadorPalavras++;
            scannerPalavras.next();
        }

        System.out.println("Linhas no texto: "+contadorLinhas);
        System.out.println("Palavras no texto: "+contadorPalavras);

    }
}
