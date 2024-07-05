package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.LibraryFiles.imprimirFicheiro;

public class ex08 {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("\nO seu pedido contem: \n");
        imprimirFicheiro("Ficheiros/exercicio_10.csv");

        File ficheiro = new File("Ficheiros/exercicio_10.csv");
        Scanner fileScanner = new Scanner(ficheiro);

        String linha = fileScanner.nextLine();

        double total = 0, quantidadeVendida, precoUnitario;

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();
            String[] itensLinha = linha.split(",");

            quantidadeVendida = Double.parseDouble(itensLinha[2]);
            precoUnitario = Double.parseDouble(itensLinha[3]);

            total += (quantidadeVendida * precoUnitario);
        }

        System.out.println("Total: " + total + " €");
    }
}

