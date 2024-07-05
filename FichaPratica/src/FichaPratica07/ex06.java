package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.LibraryFiles.imprimirFicheiro;

public class ex06 {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("\nO seu ficheiro contem: \n");
        imprimirFicheiro("Ficheiros/exercicio_06.txt");

        File ficheiro = new File("Ficheiros/exercicio_06.txt");
        Scanner fileScanner = new Scanner(ficheiro);

        String linhaAtual, nomeAtual, nomeMaisVelho="";
        int idadeAtual, idadeMaisVelho=0;

        // Enquanto o ficheiro tiver uma linha para a frente
        while (fileScanner.hasNextLine()){

            // Atribui a linhaAtual
            linhaAtual= fileScanner.nextLine();

            // Separar a linha atual pela ,
            String[] itensLinha = linhaAtual.split(",");

            nomeAtual=itensLinha[0];
            idadeAtual=Integer.parseInt(itensLinha[1]);

            if(idadeAtual>idadeMaisVelho){
                idadeMaisVelho=idadeAtual;
                nomeMaisVelho=nomeAtual;
            }

        }

        System.out.println("Pessoa Mais Velha: "+nomeMaisVelho+" com "+idadeMaisVelho+" anos!");

    }
}
