package EX_03;

import java.util.ArrayList;

public class BarcoPesca {

    private String nome;
    private String cor;
    private String anoFrabrico;
    private MarcaBarco marcaBarco;
    private int tripulacao;
    private double capacidadeCarga;

    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscosPescados;

    public BarcoPesca(String nome, String cor, String anoFrabrico, MarcaBarco marcaBarco, int tripulacao, double capacidadeCarga) {
        this.nome = nome;
        this.cor = cor;
        this.anoFrabrico = anoFrabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.peixesPescados = new ArrayList<Peixe>();
        this.mariscosPescados = new ArrayList<Marisco>();
    }

    public void pescarPeixe(Peixe peixeNovo) {
        System.out.println("Peixe pescado: " + peixeNovo.getEspecie());
        this.peixesPescados.add(peixeNovo);
    }

    public void pescarMarisco(Marisco mariscoNovo) {
        System.out.println("Peixe pescado: " + mariscoNovo.getEspecie());
        this.mariscosPescados.add(mariscoNovo);
    }

    public void exibirDetalhesPesca() {
        System.out.println("Lista de pesca");

        for (int X = 0; X < peixesPescados.size(); X++) {
            System.out.println("Participantes " + (X + 1) + " - ");
            this.mariscosPescados.get(X).exibirDetalhes();
        }

        for (int Y = 0; Y < mariscosPescados.size(); Y++) {
            System.out.println("Participantes " + (Y + 1) + " - ");
            this.mariscosPescados.get(Y).exibirDetalhes();
        }

    }

}
