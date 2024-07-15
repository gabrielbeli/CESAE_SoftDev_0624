package EX_07;

public class Main {

    public static void main(String[] args) {

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia", 1216, 97805455);
        Livro livro2 = new Livro("1984", "George Orwell", "Ficção Científica", 328, 97804515);

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
