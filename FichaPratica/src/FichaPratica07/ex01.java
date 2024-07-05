package FichaPratica07;

import java.io.FileNotFoundException;

import static FichaPratica07.LibraryFiles.imprimirFicheiro;

public class ex01 {
    public static void main(String[] args) throws FileNotFoundException {

        imprimirFicheiro("Ficheiros/exercicio_01.txt");
        imprimirFicheiro("Ficheiros/exercicio_01_Alternativa01.txt");
        imprimirFicheiro("Ficheiros/exercicio_01_Alternativa02.txt");

    }
}


