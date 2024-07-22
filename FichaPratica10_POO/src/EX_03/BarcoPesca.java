package EX_03;

import java.util.ArrayList;

public class BarcoPesca {

    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private MarcaBarco marca;
    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscoPescado;

    public BarcoPesca(String nome, String cor, int anoFabrico, MarcaBarco marca, int tripulacao, double capacidadeCarga) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.peixesPescados = new ArrayList<>();
        this.mariscoPescado = new ArrayList<>();
    }

    public void pescarPeixe(Peixe peixe) {
        if (calcularPesoTotal() + peixe.getPeso() <= capacidadeCarga) {
            peixesPescados.add(peixe);
        } else {
            System.out.println("Carga excede a capacidade do barco!");
        }
    }

    public void pescarMarisco(Marisco marisco) {
        if (calcularPesoTotal() + marisco.getPeso() <= capacidadeCarga) {
            mariscoPescado.add(marisco);
        } else {
            System.out.println("Carga excede a capacidade do barco!");
        }
    }

    public void largarPeixe(int index) {
        if (index >= 0 && index < peixesPescados.size()) {
            peixesPescados.remove(index);
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void largarMarisco(int index) {
        if (index >= 0 && index < mariscoPescado.size()) {
            mariscoPescado.remove(index);
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Peixe peixe : peixesPescados) {
            total += peixe.getPeso() * peixe.getPrecoPorKg();
        }
        for (Marisco marisco : mariscoPescado) {
            total += marisco.getPeso() * marisco.getPrecoPorKg();
        }
        return total;
    }

    public double salarioTripulacao() {
        double total = calcularTotal();
        double valorRestante = total * 0.60; // 40% é retirado para gastos/manutenção e salário do capitão
        return valorRestante / tripulacao;
    }

    public double calcularPesoTotal() {
        double pesoTotal = 0;
        for (Peixe peixe : peixesPescados) {
            pesoTotal += peixe.getPeso();
        }
        for (Marisco marisco : mariscoPescado) {
            pesoTotal += marisco.getPeso();
        }
        return pesoTotal;
    }

    public String getNome() {
        return nome;
    }

    public void exibirDetalhesPesca() {
        System.out.println("\n \uD83D\uDCDD Relatorio de peixes");

        for (int X = 0; X < peixesPescados.size(); X++) {
            System.out.println("\n \uD83D\uDC1F Peixe " + (X + 1) + " - ");
            this.peixesPescados.get(X).exibirDetalhes();
        }

        for (int Y = 0; Y < mariscoPescado.size(); Y++) {
            System.out.println("\n \uD83E\uDD9E Marisco " + (Y + 1) + " - ");
            this.mariscoPescado.get(Y).exibirDetalhes();
        }


    }

}


