package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LibraryFiles {

    /**
     * Método para imprimir na consola o conteudo de um ficheiro
     * @param caminho Caminho do Ficheiro
     * @throws FileNotFoundException Se não encontrar o ficheiro no caminho especificado
     */
    public static void imprimirFicheiro(String caminho) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File(caminho));

        String linha;

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();
            System.out.println(linha );
        }

        System.out.println();

    }

}
