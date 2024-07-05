package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static FichaPratica07.LibraryFiles.imprimirFicheiro;

public class ex03 {
    public static void main(String[] args) throws FileNotFoundException {

        File ficheiroOriginal = new File("Ficheiros/exercicio_03_Alternativa01.txt");
        File ficheiroNovo = new File("Ficheiros/exercicio_03_copia.txt");

        Scanner maquinaLer = new Scanner(ficheiroOriginal);

        PrintWriter maquinaEscrever = new PrintWriter(ficheiroNovo);

        String linhaAtual;

        while (maquinaLer.hasNextLine()) {
            linhaAtual = maquinaLer.nextLine();
            //System.out.println(linhaAtual);
            maquinaEscrever.println(linhaAtual);
        }

        maquinaEscrever.close();
    }
}
