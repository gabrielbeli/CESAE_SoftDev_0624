package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ex02 {
    public static void main(String[] args) throws FileNotFoundException {

        File novoFicheiro = new File("Ficheiros/exercicio_02.txt");

        PrintWriter escritaNoFicheiro = new PrintWriter(novoFicheiro);

        String mensagem = "Vai tudo ficar bem!";

        escritaNoFicheiro.println(mensagem);

        escritaNoFicheiro.close();
    }
}



