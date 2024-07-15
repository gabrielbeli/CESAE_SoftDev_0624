package EX_07;

public class Livro {

    private String titulo;
    private String autor;
    private String categoria;
    private int numero_paginas;
    private int isbn;

    public Livro(String titulo, String autor, String categoria, int numero_paginas, int isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numero_paginas = numero_paginas;
        this.isbn = isbn;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Número de Páginas: " + this.numero_paginas);
        System.out.println("ISBN: " + this.isbn);
        System.out.println();
    }
}
